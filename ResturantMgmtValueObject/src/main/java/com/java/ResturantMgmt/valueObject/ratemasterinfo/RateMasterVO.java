package com.java.ResturantMgmt.valueObject.ratemasterinfo;

import java.util.List;

import com.java.ResturantMgmt.dto.TblRateMaster;
import com.java.ResturantMgmt.valueObject.util.GenericVO;

public class RateMasterVO extends GenericVO {
	private String message;
	private List<TblRateMaster> TblRateMasterInfo;

	public List<TblRateMaster> getTblRateMasterInfo() {
		return TblRateMasterInfo;
	}

	public void setTblRateMasterInfo(List<TblRateMaster> tblRateMasterInfo) {
		TblRateMasterInfo = tblRateMasterInfo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
