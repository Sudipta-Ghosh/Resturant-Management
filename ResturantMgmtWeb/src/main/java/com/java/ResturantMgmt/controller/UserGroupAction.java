package com.java.ResturantMgmt.controller;

import java.util.List;


import com.java.ResturantMgmt.core.service.usergroup.impl.UserGroupService;
import com.java.ResturantMgmt.dto.TUserGroup;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class UserGroupAction extends ActionSupport implements Preparable	 {
	
private static final long serialVersionUID = 1L;
	
	//Logger configured using log4j
//	private static final Logger logger = Logger.getLogger(UserGroupAction.class);
	
	   //List of user groups; Setter and Getter are below
		private List<TUserGroup> lstUserGroup;
		//usergroup object to be added; Setter and Getter are below
		private TUserGroup userGroup;
		
		//Employee manager injected by spring context; This is cool !!
		private UserGroupService userGroupBO;
		
		
		public String listEmployees() {
			//logger.info("listEmployees method called");
			return SUCCESS;
		}

		//This method will be called when a employee object is added
		public String addEmployee() {
			//logger.info("addEmployee method called");
			//userGroupBO.save(userGroup);;
			return SUCCESS;
		}
		

		public List<TUserGroup> getLstUserGroup() {
			return lstUserGroup;
		}
		public void setLstUserGroup(List<TUserGroup> lstUserGroup) {
			this.lstUserGroup = lstUserGroup;
		}
		public TUserGroup getUserGroup() {
			return userGroup;
		}
		public void setUserGroup(TUserGroup userGroup) {
			this.userGroup = userGroup;
		}
		public void setUserGroupBO(UserGroupService userGroupBO) {
			this.userGroupBO = userGroupBO;
		}
		public void prepare() throws Exception {
			userGroup=null;
		}

}
