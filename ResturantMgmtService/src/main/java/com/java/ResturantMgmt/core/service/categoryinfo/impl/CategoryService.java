package com.java.ResturantMgmt.core.service.categoryinfo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.ResturantMgmt.common.service.GenericService;
import com.java.ResturantMgmt.dao.impl.categoryinfo.CategoryDao;
import com.java.ResturantMgmt.dto.TblCategory;
import com.java.ResturantMgmt.dto.util.GenericDTO;
import com.java.ResturantMgmt.valueObject.categoryinfo.CategoryVO;
import com.java.ResturantMgmt.valueObject.util.GenericVO;

public class CategoryService extends GenericService {
	private CategoryDao categoryDao ; 

	@Autowired
	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	@Override	
	public GenericVO doProcess(GenericDTO genericdto) {
		// TODO Auto-generated method stub
		CategoryVO categoryVO =new CategoryVO();
		String strEvent=genericdto.getEvent();
		List tblCategory=new ArrayList();
		if(strEvent!=null && strEvent.equals("Save")){
			categoryVO=saveCategoryInfo(genericdto);
		}else if(strEvent!=null && strEvent.equals("delete")){
			categoryVO=deleteTableInfo(genericdto);
		}
		else{
			tblCategory=searchCategoryInfo(genericdto);
			categoryVO.setTblCategoryInfo(tblCategory);
		}
		
		return categoryVO;
	}

	private CategoryVO saveCategoryInfo (GenericDTO genericdto) {
		CategoryVO categoryVO =new CategoryVO();
		
		// TODO Auto-generated method stub
		categoryVO=categoryDao.save((TblCategory)genericdto);
		
		return categoryVO;
	}
	private CategoryVO deleteTableInfo (GenericDTO genericdto) {
		CategoryVO categoryVO =new CategoryVO();
		
		// TODO Auto-generated method stub
		categoryVO=categoryDao.delete((TblCategory)genericdto);
		
		return categoryVO;
	}
	private List<TblCategory> searchCategoryInfo(GenericDTO genericdto) {
		List<TblCategory> lsTblCategory =new ArrayList();
		
		// TODO Auto-generated method stub
		lsTblCategory=categoryDao.findByCategoryId(((TblCategory)genericdto).getCategoryId());
		
		return lsTblCategory;
	}

}
