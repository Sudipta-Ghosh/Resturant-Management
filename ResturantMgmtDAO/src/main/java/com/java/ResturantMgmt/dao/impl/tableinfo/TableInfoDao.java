package com.java.ResturantMgmt.dao.impl.tableinfo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.ResturantMgmt.dao.tableinfo.ITableInfoDao;
import com.java.ResturantMgmt.dto.TTableInfo;
import com.java.ResturantMgmt.valueObject.tableinfo.TableInfoVO;


@Repository("TableInfoDao")
public class TableInfoDao   implements ITableInfoDao{
	
	 private SessionFactory sessionFactory;
	 private TableInfoVO tableInfoVO =new TableInfoVO();
	
	public TableInfoVO save(TTableInfo tTableInfo ) {
		// TODO Auto-generated method stub
		TableInfoVO tableInfoVO =new TableInfoVO();
		this.sessionFactory.getCurrentSession().merge(tTableInfo);
		tableInfoVO.setMessage("1 UserGroup Save Successfully");
		return tableInfoVO;
	}


	public void update(TTableInfo userGroupTo) {
		// TODO Auto-generated method stub
		
	}

	
	public TableInfoVO delete(TTableInfo userGroupTo) {
		// TODO Auto-generated method stub
		TableInfoVO tableInfoVO =new TableInfoVO();
		tableInfoVO.setMessage("1 UserGroup Deleted Successfully");
		return tableInfoVO;
		
	}

	
	public List<TTableInfo> findByTableInfoId(Long tableInfoId) {
		// TODO Auto-generated method stub
		TTableInfo tTableInfo =new TTableInfo();
		Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(TTableInfo.class);
		criteria.add(tableInfoId == null ? Restrictions.isNotNull("TABLE_ID"): Restrictions.eq("TABLE_ID", tableInfoId ));
		return  criteria.list();
			       
			       
		
	}
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
