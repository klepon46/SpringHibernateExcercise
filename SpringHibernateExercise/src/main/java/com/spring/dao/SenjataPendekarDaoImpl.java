package com.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.bean.SenjataPendekar;
import com.spring.util.MyHibernateSupport;

@Repository("senjataPendekarDao")
public class SenjataPendekarDaoImpl extends MyHibernateSupport implements SenjataPendekarDao {

	public void save(SenjataPendekar domain) {
		getHibernateTemplate().getSessionFactory().getCurrentSession().save(domain);
	}

	public void update(SenjataPendekar domain) {
		// TODO Auto-generated method stub
		
	}

	public void delete(SenjataPendekar domain) {
		// TODO Auto-generated method stub
		
	}

	public void create(SenjataPendekar domain) {
		// TODO Auto-generated method stub
		
	}

	public List<SenjataPendekar> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
