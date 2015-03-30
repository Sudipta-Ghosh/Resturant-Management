package com.java.ResturantMgmt.dao.impl.categoryinfo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.java.ResturantMgmt.dao.categoryinfo.ICategoryDao;

import com.java.ResturantMgmt.dto.TblCategory;
import com.java.ResturantMgmt.valueObject.categoryinfo.CategoryVO;

public class CategoryDao  implements ICategoryDao{
	 private SessionFactory sessionFactory;
	
	public CategoryVO save(TblCategory tblCategory ) {
		// TODO Auto-generated method stub
		CategoryVO CategoryVO =new CategoryVO();
		this.sessionFactory.getCurrentSession().merge(tblCategory);
		CategoryVO.setMessage("1 Category Save Successfully");
		return CategoryVO;
	}


	public void update(TblCategory userGroupTo) {
		// TODO Auto-generated method stub
		
	}

	
	public CategoryVO delete(TblCategory userGroupTo) {
		// TODO Auto-generated method stub
		CategoryVO CategoryVO =new CategoryVO();
		CategoryVO.setMessage("1 Category Deleted Successfully");
		return CategoryVO;
		
	}

	
	public List<TblCategory> findByCategoryId(Long categoryInfoId) {
		new TblCategory();
		Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(TblCategory.class);
		criteria.add(categoryInfoId == null ? Restrictions.isNotNull("TABLE_ID"): Restrictions.eq("TABLE_ID", categoryInfoId ));
		return  criteria.list();
			       
			       
		
	}
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
