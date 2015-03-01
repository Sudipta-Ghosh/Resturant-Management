package com.java.ResturantMgmt.core.service.usergroup.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.ResturantMgmt.common.service.GenericService;
import com.java.ResturantMgmt.dao.impl.usergroup.UserGroupDao;
import com.java.ResturantMgmt.dto.TUserGroup;
import com.java.ResturantMgmt.dto.util.GenericDTO;
import com.java.ResturantMgmt.valueObject.usergroup.UserGroupVO;
import com.java.ResturantMgmt.valueObject.util.GenericVO;

@Transactional
public class UserGroupService extends GenericService {

	private UserGroupDao userGroupDao ; 

	@Autowired
	public void setUserGroupDao(UserGroupDao userGroupDao) {
		this.userGroupDao = userGroupDao;
	}
	@Override	
	public GenericVO doProcess(GenericDTO genericdto) {
		// TODO Auto-generated method stub
		GenericVO genericVO=saveUserGroup(genericdto);
		return genericVO;
	}

	private UserGroupVO saveUserGroup(GenericDTO genericdto) {
		UserGroupVO userGroupVO =new UserGroupVO();
		// TODO Auto-generated method stub
		userGroupVO=userGroupDao.save((TUserGroup) genericdto);
		
		return userGroupVO;
	}

	
	
	
	
	

	
	
	

}
