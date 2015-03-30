package com.java.ResturantMgmt.dao.impl.ratemasterinfo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.java.ResturantMgmt.dto.TblRateMaster;
import com.java.ResturantMgmt.valueObject.ratemasterinfo.RateMasterVO;


public class RateMasterDao {
	 private SessionFactory sessionFactory;

		
		public RateMasterVO save(TblRateMaster tblRateMaster ) {
			// TODO Auto-generated method stub
			RateMasterVO RateMasterVO =new RateMasterVO();
			this.sessionFactory.getCurrentSession().merge(tblRateMaster);
			RateMasterVO.setMessage("1 Rate Save Successfully");
			return RateMasterVO;
		}


		public void update(TblRateMaster userGroupTo) {
			// TODO Auto-generated method stub
			
		}

		
		public RateMasterVO delete(TblRateMaster tblRateMaster) {
			// TODO Auto-generated method stub
			RateMasterVO RateMasterVO =new RateMasterVO();
			RateMasterVO.setMessage("1 Rate Deleted Successfully");
			return RateMasterVO;
			
		}

		
		public List<TblRateMaster> findByRateMasterId(Long rateMasterId) {
			// TODO Auto-generated method stub
			TblRateMaster TblRateMaster =new TblRateMaster();
			Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(TblRateMaster.class);
			criteria.add(rateMasterId == null ? Restrictions.isNotNull("TABLE_ID"): Restrictions.eq("TABLE_ID", rateMasterId ));
			return  criteria.list();
				       
				       
			
		}
		@Autowired
		public void setSessionFactory(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }
}
