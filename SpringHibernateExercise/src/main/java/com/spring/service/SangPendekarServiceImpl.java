package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.bean.SangPendekar;
import com.spring.dao.SangPendekarDao;

@Service("sangPendekar")
@Transactional
public class SangPendekarServiceImpl implements SangPendekarService{

	@Autowired
	SangPendekarDao sangPendekarDao;
	
	public void save(SangPendekar domain) {
		sangPendekarDao.save(domain);
	}

	public void delete(SangPendekar domain) {
		sangPendekarDao.delete(domain);
		
	}

	public void update(SangPendekar domain) {
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
