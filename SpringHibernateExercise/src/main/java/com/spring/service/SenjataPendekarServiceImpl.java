package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.bean.SenjataPendekar;
import com.spring.dao.SenjataPendekarDao;

@Service("senjataPendekar")
public class SenjataPendekarServiceImpl implements SenjataPendekarService {
	
	@Autowired
	SenjataPendekarDao senjataPendekarDao;
	
	public void save(SenjataPendekar domain) {
		senjataPendekarDao.save(domain);
	}

	public void delete(SenjataPendekar domain) {
		// TODO Auto-generated method stub
	}

	public void update(SenjataPendekar domain) {
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
