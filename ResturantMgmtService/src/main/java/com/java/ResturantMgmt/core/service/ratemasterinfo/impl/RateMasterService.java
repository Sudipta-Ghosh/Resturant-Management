package com.java.ResturantMgmt.core.service.ratemasterinfo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.ResturantMgmt.common.service.GenericService;
import com.java.ResturantMgmt.dao.impl.ratemasterinfo.RateMasterDao;
import com.java.ResturantMgmt.dto.TblRateMaster;
import com.java.ResturantMgmt.dto.util.GenericDTO;
import com.java.ResturantMgmt.valueObject.ratemasterinfo.RateMasterVO;
import com.java.ResturantMgmt.valueObject.util.GenericVO;

public class RateMasterService extends GenericService{ 
	private RateMasterDao rateMasterDao ; 

	@Autowired
	public void setRateMasterDao(RateMasterDao rateMasterDao) {
		this.rateMasterDao = rateMasterDao;
	}

	@Override	
	public GenericVO doProcess(GenericDTO genericdto) {
		// TODO Auto-generated method stub
		RateMasterVO rateMasterVO =new RateMasterVO();
		String strEvent=genericdto.getEvent();
		List TblRateMaster=new ArrayList();
		if(strEvent!=null && strEvent.equals("Save")){
			rateMasterVO=saveMenuInfo(genericdto);
		}else if(strEvent!=null && strEvent.equals("delete")){
			rateMasterVO=deleteMenuInfo(genericdto);
		}
		else{
			TblRateMaster=searchMenuInfo(genericdto);
			rateMasterVO.setTblRateMasterInfo(TblRateMaster);
		}
		
		return rateMasterVO;
	}

	private RateMasterVO saveMenuInfo (GenericDTO genericdto) {
		RateMasterVO rateMasterVO =new RateMasterVO();
		
		// TODO Auto-generated method stub
		rateMasterVO=rateMasterDao.save((TblRateMaster)genericdto);
		
		return rateMasterVO;
	}
	private RateMasterVO deleteMenuInfo (GenericDTO genericdto) {
		RateMasterVO RateMasterVO =new RateMasterVO();
		
		// TODO Auto-generated method stub
		RateMasterVO=rateMasterDao.delete((TblRateMaster)genericdto);
		
		return RateMasterVO;
	}
	private List<TblRateMaster> searchMenuInfo(GenericDTO genericdto) {
		List<TblRateMaster> lsTblRateMaster =new ArrayList();
		
		// TODO Auto-generated method stub
		lsTblRateMaster=rateMasterDao.findByRateMasterId(((TblRateMaster)genericdto).getRateId());
		
		return lsTblRateMaster;
	}

}
