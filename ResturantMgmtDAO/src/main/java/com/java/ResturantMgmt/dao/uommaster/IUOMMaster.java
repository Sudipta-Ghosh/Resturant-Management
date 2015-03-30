package com.java.ResturantMgmt.dao.uommaster;

import java.util.List;

import com.java.ResturantMgmt.dto.TblUomMaster;
import com.java.ResturantMgmt.valueObject.uominfo.UomMasterVO;

public interface IUOMMaster {
	UomMasterVO save(TblUomMaster tblUomMaster);
	void update(TblUomMaster tblUomMaster);
	UomMasterVO delete(TblUomMaster TblUomMaster);
	List<TblUomMaster> findByUOMMasterId(Long uomMasterId);
}
