package com.kmh.spring.service.impl;

import java.io.Serializable;
import java.util.List;

import com.kmh.spring.dao.BaseDao;
import com.kmh.spring.service.BaseService;

public abstract class BaseServiceImpl<T extends Serializable> implements BaseService<T> {

	private static final long serialVersionUID = 1L;

	private final BaseDao<T> dao;

	public BaseServiceImpl(final BaseDao<T> dao) {
		super();
		this.dao = dao;
	}

	@Override
	public void save(final T t) {
		dao.save(t);
	}

	@Override
	public void edit(final T t) {
		this.dao.update(t);
	}

	@Override
	public void delete(final T t) {

	}

	@Override
	public T finbyById(final Integer id) {
		return null;
	}

	@Override
	public List<T> findAll() {
		return this.dao.findAll();
	}

}
