package com.kmh.spring.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T extends Serializable> extends Serializable {

	void save(T t);

	void update(T t);

	void delete(T t);

	T finbyById(Integer id);

	List<T> findAll();

}