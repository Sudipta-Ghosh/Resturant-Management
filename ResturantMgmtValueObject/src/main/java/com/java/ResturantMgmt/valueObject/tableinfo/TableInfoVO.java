package com.java.ResturantMgmt.valueObject.tableinfo;

import java.util.List;

import com.java.ResturantMgmt.dto.TTableInfo;
import com.java.ResturantMgmt.valueObject.util.GenericVO;

public class TableInfoVO extends GenericVO  {
	
	private String message;
	private List<TTableInfo> tTableInfo;

	
	public List<TTableInfo> gettTableInfo() {
		return tTableInfo;
	}

	public void settTableInfo(List<TTableInfo> tTableInfo) {
		this.tTableInfo = tTableInfo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
