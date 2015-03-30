package com.java.ResturantMgmt.core.service.uommasterinfo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.ResturantMgmt.common.service.GenericService;
import com.java.ResturantMgmt.dao.impl.uommaster.UomMasterDao;
import com.java.ResturantMgmt.dto.TblUomMaster;
import com.java.ResturantMgmt.dto.util.GenericDTO;
import com.java.ResturantMgmt.valueObject.uominfo.UomMasterVO;
import com.java.ResturantMgmt.valueObject.util.GenericVO;

public class UOMMasterService extends GenericService{
	private UomMasterDao uomMasterDao ; 

	@Autowired
	public void setUomMasterDao(UomMasterDao uomMasterDao) {
		this.uomMasterDao = uomMasterDao;
	}

	@Override	
	public GenericVO doProcess(GenericDTO genericdto) {
		// TODO Auto-generated method stub
		UomMasterVO uomMasterVO =new UomMasterVO();
		String strEvent=genericdto.getEvent();
		List TblUomMaster=new ArrayList();
		if(strEvent!=null && strEvent.equals("Save")){
			uomMasterVO=saveMenuInfo(genericdto);
		}else if(strEvent!=null && strEvent.equals("delete")){
			uomMasterVO=deleteMenuInfo(genericdto);
		}
		else{
			TblUomMaster=searchMenuInfo(genericdto);
			uomMasterVO.setTblUomMasterInfo(TblUomMaster);
		}
		
		return uomMasterVO;
	}

	private UomMasterVO saveMenuInfo (GenericDTO genericdto) {
		UomMasterVO uomMasterVO =new UomMasterVO();
		
		// TODO Auto-generated method stub
		uomMasterVO=uomMasterDao.save((TblUomMaster)genericdto);
		
		return uomMasterVO;
	}
	private UomMasterVO deleteMenuInfo (GenericDTO genericdto) {
		UomMasterVO UomMasterVO =new UomMasterVO();
		
		// TODO Auto-generated method stub
		UomMasterVO=uomMasterDao.delete((TblUomMaster)genericdto);
		
		return UomMasterVO;
	}
	private List<TblUomMaster> searchMenuInfo(GenericDTO genericdto) {
		List<TblUomMaster> lsTblUomMaster =new ArrayList();
		
		// TODO Auto-generated method stub
		lsTblUomMaster=uomMasterDao.findByUOMMasterId(((TblUomMaster)genericdto).getUomId());
		
		return lsTblUomMaster;
	}
}
