package com.kmh.spring.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T extends Serializable> extends Serializable {

	void save(T t);

	void edit(T t);

	void delete(T t);

	T finbyById(Integer id);

	List<T> findAll();

}