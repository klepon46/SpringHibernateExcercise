package com.spring.util;

import java.util.List;

public interface PendekarGenericDao<T> {
	public void save(T domain);
	public void update(T domain);
	public void delete(T domain);
	public void create(T domain);
	public List<T> findAll();
	
}
