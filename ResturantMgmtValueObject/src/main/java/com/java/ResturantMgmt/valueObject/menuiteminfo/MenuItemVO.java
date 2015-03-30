package com.java.ResturantMgmt.valueObject.menuiteminfo;

import java.util.List;

import com.java.ResturantMgmt.dto.TblMenuItem;
import com.java.ResturantMgmt.valueObject.util.GenericVO;

public class MenuItemVO extends GenericVO{
	private String message;
	private List<TblMenuItem> tblMenuItemInfo;

	
	
	
	public List<TblMenuItem> getTblMenuItemInfo() {
		return tblMenuItemInfo;
	}

	public void setTblMenuItemInfo(List<TblMenuItem> tblMenuItemInfo) {
		this.tblMenuItemInfo = tblMenuItemInfo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
