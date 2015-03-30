package com.java.ResturantMgmt.dao.menuitem;

import java.util.List;

import com.java.ResturantMgmt.dto.TblMenuItem;
import com.java.ResturantMgmt.valueObject.menuiteminfo.MenuItemVO;


public interface IMenuItemDao {
	MenuItemVO save(TblMenuItem tblMenuItem);
	void update(TblMenuItem tblMenuItem);
	MenuItemVO delete(TblMenuItem tblMenuItem);
	public List<TblMenuItem> findByMenuId(Long menuItemId);
}
