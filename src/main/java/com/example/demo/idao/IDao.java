package com.example.demo.idao;

import java.util.List;

import com.example.demo.entity.Ville;
import com.example.demo.entity.Zone;

public interface IDao<T> {

	List<T> findAll();

	T findById(int id);

	T save(T t);

	void delete(T t);

	void update(T t);

	

}
