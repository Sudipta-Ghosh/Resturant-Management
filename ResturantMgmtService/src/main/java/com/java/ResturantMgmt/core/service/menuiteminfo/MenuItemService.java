package com.java.ResturantMgmt.core.service.menuiteminfo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.ResturantMgmt.common.service.GenericService;
import com.java.ResturantMgmt.dao.impl.menuitem.MenuItemDao;
import com.java.ResturantMgmt.dto.TblMenuItem;
import com.java.ResturantMgmt.dto.util.GenericDTO;
import com.java.ResturantMgmt.valueObject.menuiteminfo.MenuItemVO;
import com.java.ResturantMgmt.valueObject.util.GenericVO;

public class MenuItemService extends GenericService{
	private MenuItemDao menuItemDao ; 

	@Autowired
	public void setMenuItemDao(MenuItemDao menuItemDao) {
		this.menuItemDao = menuItemDao;
	}

	@Override	
	public GenericVO doProcess(GenericDTO genericdto) {
		// TODO Auto-generated method stub
		MenuItemVO menuItemVO =new MenuItemVO();
		String strEvent=genericdto.getEvent();
		List TblMenuItem=new ArrayList();
		if(strEvent!=null && strEvent.equals("Save")){
			menuItemVO=saveMenuInfo(genericdto);
		}else if(strEvent!=null && strEvent.equals("delete")){
			menuItemVO=deleteMenuInfo(genericdto);
		}
		else{
			TblMenuItem=searchMenuInfo(genericdto);
			menuItemVO.setTblMenuItemInfo(TblMenuItem);
		}
		
		return menuItemVO;
	}

	private MenuItemVO saveMenuInfo (GenericDTO genericdto) {
		MenuItemVO menuItemVO =new MenuItemVO();
		
		// TODO Auto-generated method stub
		menuItemVO=menuItemDao.save((TblMenuItem)genericdto);
		
		return menuItemVO;
	}
	private MenuItemVO deleteMenuInfo (GenericDTO genericdto) {
		MenuItemVO MenuItemVO =new MenuItemVO();
		
		// TODO Auto-generated method stub
		MenuItemVO=menuItemDao.delete((TblMenuItem)genericdto);
		
		return MenuItemVO;
	}
	private List<TblMenuItem> searchMenuInfo(GenericDTO genericdto) {
		List<TblMenuItem> lsTblMenuItem =new ArrayList();
		
		// TODO Auto-generated method stub
		lsTblMenuItem=menuItemDao.findByMenuId(((TblMenuItem)genericdto).getMenuItemId());
		
		return lsTblMenuItem;
	}
}
