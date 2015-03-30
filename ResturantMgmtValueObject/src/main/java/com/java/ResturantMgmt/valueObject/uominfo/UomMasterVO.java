package com.java.ResturantMgmt.valueObject.uominfo;

import java.util.List;

import com.java.ResturantMgmt.dto.TblUomMaster;
import com.java.ResturantMgmt.valueObject.util.GenericVO;

public class UomMasterVO extends GenericVO {
	private String message;
	private List<TblUomMaster> tblUomMasterInfo;

	

	public List<TblUomMaster> getTblUomMasterInfo() {
		return tblUomMasterInfo;
	}

	public void setTblUomMasterInfo(List<TblUomMaster> tblUomMasterInfo) {
		this.tblUomMasterInfo = tblUomMasterInfo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
