package com.java.ResturantMgmt.controller;

import javax.servlet.http.HttpServletRequest;

import com.java.ResturantMgmt.common.businessdelegate.BusinessDelegate;
import com.java.ResturantMgmt.dto.TTableInfo;
import com.java.ResturantMgmt.valueObject.tableinfo.TableInfoVO;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.ServletRequestAware;
 


public class TableInfoController extends ActionSupport implements ServletRequestAware {

	HttpServletRequest request;

	
	public String execute() {
		String tableId = getServletRequest().getParameter("tableId");
		String action = getServletRequest().getParameter("action");
		String event = getServletRequest().getParameter("event");
		BusinessDelegate objBusinessDelegate=new BusinessDelegate();
		TTableInfo tTableInfo =new TTableInfo();
		 tTableInfo.setAction(action);
		 tTableInfo.setEvent(event);
		 String returnConst="";

		tTableInfo.setTABLE_ID(Long.valueOf(tableId));
		TableInfoVO tableInfoVO = (TableInfoVO) objBusinessDelegate.doProcess(tTableInfo);
		for ( TTableInfo tTableInfoOut:tableInfoVO.gettTableInfo()){
			request.setAttribute("tableInfo", tTableInfoOut);
		}
		if(event!=null && event.equals("Search")){
			returnConst= "SUCCESS-SEARCH";
		}else if(event!=null && event.equals("Delete")){
			returnConst= "SUCCESS-DELETE";
		}
		return returnConst;
 
	}

	public HttpServletRequest getServletRequest() {
		return request;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	
	

}
