package com.java.ResturantMgmt.dao.impl.menuitem;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.java.ResturantMgmt.dto.TblMenuItem;
import com.java.ResturantMgmt.valueObject.menuiteminfo.MenuItemVO;
import com.java.ResturantMgmt.dao.menuitem.IMenuItemDao;

public class MenuItemDao implements IMenuItemDao {
	 private SessionFactory sessionFactory;

	
	public MenuItemVO save(TblMenuItem tblMenuItem ) {
		// TODO Auto-generated method stub
		MenuItemVO menuItemVO =new MenuItemVO();
		this.sessionFactory.getCurrentSession().merge(tblMenuItem);
		menuItemVO.setMessage("1 Manu Save Successfully");
		return menuItemVO;
	}


	public void update(TblMenuItem userGroupTo) {
		// TODO Auto-generated method stub
		
	}

	
	public MenuItemVO delete(TblMenuItem tblMenuItem) {
		// TODO Auto-generated method stub
		MenuItemVO MenuItemVO =new MenuItemVO();
		MenuItemVO.setMessage("1 Menu Deleted Successfully");
		return MenuItemVO;
		
	}

	
	public List<TblMenuItem> findByMenuId(Long menuItemId) {
		// TODO Auto-generated method stub
		TblMenuItem tblMenuItem =new TblMenuItem();
		Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(TblMenuItem.class);
		criteria.add(menuItemId == null ? Restrictions.isNotNull("TABLE_ID"): Restrictions.eq("TABLE_ID", menuItemId ));
		return  criteria.list();
			       
			       
		
	}
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
