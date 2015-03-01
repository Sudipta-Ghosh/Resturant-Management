package com.java.ResturantMgmt.core.service.tableinfo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.java.ResturantMgmt.common.service.GenericService;
import com.java.ResturantMgmt.dao.impl.tableinfo.TableInfoDao;
import com.java.ResturantMgmt.dto.TTableInfo;
import com.java.ResturantMgmt.dto.util.GenericDTO;
import com.java.ResturantMgmt.valueObject.tableinfo.TableInfoVO;
import com.java.ResturantMgmt.valueObject.util.GenericVO;

@Transactional
public class TableInfoService extends GenericService {

	private TableInfoDao tableInfoDao ; 

	@Autowired
	public void setTableInfoDao(TableInfoDao tableInfoDao) {
		this.tableInfoDao = tableInfoDao;
	}

	@Override	
	public GenericVO doProcess(GenericDTO genericdto) {
		// TODO Auto-generated method stub
		TableInfoVO tableInfoVO =new TableInfoVO();
		String strEvent=genericdto.getEvent();
		List tTableInfo=new ArrayList();
		if(strEvent!=null && strEvent.equals("Save")){
			tableInfoVO=saveTableInfo(genericdto);
		}else if(strEvent!=null && strEvent.equals("delete")){
			tableInfoVO=deleteTableInfo(genericdto);
		}
		else{
			tTableInfo=searchTableInfo(genericdto);
			tableInfoVO.settTableInfo(tTableInfo);
		}
		
		return tableInfoVO;
	}

	private TableInfoVO saveTableInfo (GenericDTO genericdto) {
		TableInfoVO tableInfoVO =new TableInfoVO();
		
		// TODO Auto-generated method stub
		tableInfoVO=tableInfoDao.save((TTableInfo)genericdto);
		
		return tableInfoVO;
	}
	private TableInfoVO deleteTableInfo (GenericDTO genericdto) {
		TableInfoVO tableInfoVO =new TableInfoVO();
		
		// TODO Auto-generated method stub
		tableInfoVO=tableInfoDao.delete((TTableInfo)genericdto);
		
		return tableInfoVO;
	}
	private List<TTableInfo> searchTableInfo(GenericDTO genericdto) {
		List<TTableInfo> lstTableInfo =new ArrayList();
		
		// TODO Auto-generated method stub
		lstTableInfo=tableInfoDao.findByTableInfoId(((TTableInfo)genericdto).getTABLE_ID());
		
		return lstTableInfo;
	}

}
