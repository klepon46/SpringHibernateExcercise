package com.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.bean.SangPendekar;
import com.spring.util.MyHibernateSupport;

@Repository("sangPendekarDao")
public class SangPendekarDaoImpl extends MyHibernateSupport implements SangPendekarDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void save(SangPendekar domain) {
		getHibernateTemplate().getSessionFactory().getCurrentSession().save(domain);
	}

	public void update(SangPendekar domain) {
		// TODO Auto-generated method stub
		
	}

	public void delete(SangPendekar domain) {
		// TODO Auto-generated method stub
		
	}

	public void create(SangPendekar domain) {
		// TODO Auto-generated method stub
		
	}

	public List<SangPendekar> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
