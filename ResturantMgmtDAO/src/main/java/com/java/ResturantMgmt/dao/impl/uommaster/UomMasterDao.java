package com.java.ResturantMgmt.dao.impl.uommaster;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.java.ResturantMgmt.dao.uommaster.IUOMMaster;
import com.java.ResturantMgmt.dto.TblUomMaster;
import com.java.ResturantMgmt.valueObject.uominfo.UomMasterVO;

public class UomMasterDao implements IUOMMaster {
	 private SessionFactory sessionFactory;

		
		public UomMasterVO save(TblUomMaster tblUomMaster ) {
			// TODO Auto-generated method stub
			UomMasterVO menuItemVO =new UomMasterVO();
			this.sessionFactory.getCurrentSession().merge(tblUomMaster);
			menuItemVO.setMessage("1 UOM Save Successfully");
			return menuItemVO;
		}


		public void update(TblUomMaster userGroupTo) {
			// TODO Auto-generated method stub
			
		}

		
		public UomMasterVO delete(TblUomMaster tblUomMaster) {
			// TODO Auto-generated method stub
			UomMasterVO UomMasterVO =new UomMasterVO();
			UomMasterVO.setMessage("1 UOM Deleted Successfully");
			return UomMasterVO;
			
		}

		
		public List<TblUomMaster> findByUOMMasterId(Long uommasterId) {
			// TODO Auto-generated method stub
			TblUomMaster tblUomMaster =new TblUomMaster();
			Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(TblUomMaster.class);
			criteria.add(uommasterId == null ? Restrictions.isNotNull("TABLE_ID"): Restrictions.eq("TABLE_ID", uommasterId ));
			return  criteria.list();
				       
				       
			
		}
		@Autowired
		public void setSessionFactory(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }
}
