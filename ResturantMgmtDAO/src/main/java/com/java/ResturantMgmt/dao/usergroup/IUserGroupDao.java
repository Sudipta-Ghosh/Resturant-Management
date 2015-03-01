package com.java.ResturantMgmt.dao.usergroup;

import com.java.ResturantMgmt.dto.TUserGroup;
import com.java.ResturantMgmt.dto.util.GenericDTO;
import com.java.ResturantMgmt.valueObject.usergroup.UserGroupVO;


public interface IUserGroupDao {
	
	UserGroupVO save(TUserGroup userGroupTo);
	void update(TUserGroup userGroupTo);
	void delete(TUserGroup userGroupTo);
	TUserGroup findByUserGroupCode(String userGroupTo);

}
