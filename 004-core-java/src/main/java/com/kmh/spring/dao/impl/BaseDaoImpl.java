package com.kmh.spring.dao.impl;

import java.io.Serializable;
import java.util.List;

import com.kmh.spring.dao.BaseDao;
import com.kmh.spring.dao.utils.DBUtils;
import com.kmh.spring.entity.Company;

public abstract class BaseDaoImpl<T extends Serializable> implements BaseDao<T> {

	private static final long serialVersionUID = 1L;

	@Override
	public void save(final T t) {
		if (t instanceof Company) {
			DBUtils.getInstance().add((Company) t);
		}
		System.out.println("Successful Save....... in DAO");
	}

	@Override
	public void update(final T t) {

		if (t instanceof Company) {
			DBUtils.getInstance().edit((Company) t);
		}
		System.out.println("Successful Update....... in DAO");
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
		return null;
	}

}
