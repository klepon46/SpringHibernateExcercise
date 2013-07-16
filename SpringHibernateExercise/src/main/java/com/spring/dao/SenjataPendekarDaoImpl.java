package com.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.util.MyHibernateSupport;

@Repository("senjataPendekarDao")
public class SenjataPendekarDaoImpl extends MyHibernateSupport implements SenjataPendekarDao {

	public void save(SenjataPendekarDao domain) {
		getHibernateTemplate().getSessionFactory().getCurrentSession().save(domain);
		
	}

	public void update(SenjataPendekarDao domain) {
		// TODO Auto-generated method stub
		
	}

	public void delete(SenjataPendekarDao domain) {
		// TODO Auto-generated method stub
		
	}

	public void create(SenjataPendekarDao domain) {
		// TODO Auto-generated method stub
		
	}

	public List<SenjataPendekarDao> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
