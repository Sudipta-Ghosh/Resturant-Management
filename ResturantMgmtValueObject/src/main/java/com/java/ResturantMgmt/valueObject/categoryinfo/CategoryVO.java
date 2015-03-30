package com.java.ResturantMgmt.valueObject.categoryinfo;


import java.util.List;
import com.java.ResturantMgmt.dto.TblCategory;
import com.java.ResturantMgmt.valueObject.util.GenericVO;

public class CategoryVO extends GenericVO  {
	
	private String message;
	private List<TblCategory> tblCategoryInfo;

	
	
	public List<TblCategory> getTblCategoryInfo() {
		return tblCategoryInfo;
	}

	public void setTblCategoryInfo(List<TblCategory> tblCategoryInfo) {
		this.tblCategoryInfo = tblCategoryInfo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}