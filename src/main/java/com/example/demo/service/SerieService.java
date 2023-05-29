package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.SerieRepository;
import com.example.demo.entity.Serie;
import com.example.demo.idao.IDao;

@Service
public class SerieService implements IDao<Serie>{

	@Autowired
	SerieRepository serieRepository;
	
	@Override
	public List<Serie> findAll() {
		
		
		return serieRepository.findAll();
	}

	@Override
	public Serie findById(int id) {
		// TODO Auto-generated method stub
		return serieRepository.findById(id).get();
	}

	@Override
	public Serie save(Serie t) {
		// TODO Auto-generated method stub
		return serieRepository.save(t);
	}

	
	public void delete(int t) {

		serieRepository.deleteById(t);
	}

	@Override
	public void update(Serie t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Serie t) {
		// TODO Auto-generated method stub
		
	}

}
