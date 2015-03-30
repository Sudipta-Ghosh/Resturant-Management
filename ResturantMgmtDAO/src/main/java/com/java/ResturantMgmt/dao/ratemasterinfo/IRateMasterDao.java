package com.java.ResturantMgmt.dao.ratemasterinfo;

import java.util.List;

import com.java.ResturantMgmt.valueObject.ratemasterinfo.RateMasterVO;
import com.java.ResturantMgmt.dto.TblRateMaster;


public interface IRateMasterDao {
	RateMasterVO save(TblRateMaster tblRateMaster);
	void update(TblRateMaster tblRateMaster);
	RateMasterVO delete(TblRateMaster TblRateMaster);
	List<TblRateMaster> findByCategoryId(Long rateMasterId);
}
