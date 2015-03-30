package com.java.ResturantMgmt.dao.categoryinfo;

import java.util.List;


import com.java.ResturantMgmt.dto.TblCategory;
import com.java.ResturantMgmt.valueObject.categoryinfo.CategoryVO;


public interface ICategoryDao {
	CategoryVO save(TblCategory tblCategory);
	void update(TblCategory tblCategory);
	CategoryVO delete(TblCategory tblCategory);
	List<TblCategory> findByCategoryId(Long categoryId);
}
