package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jca.cci.core.support.CciDaoSupport;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.SpecialiteRepository;
import com.example.demo.entity.Specialite;
import com.example.demo.idao.IDao;

@Service
public class SpecialiteService implements IDao<Specialite>{

	@Autowired
	SpecialiteRepository specialiteRepository;
	
	@Override
	public List<Specialite> findAll() {
		
		return specialiteRepository.findAll();
	}

	@Override
	public Specialite findById(int id) {
		// TODO Auto-generated method stub
		return specialiteRepository.findById(id).get();
	}

	@Override
	public Specialite save(Specialite t) {
		// TODO Auto-generated method stub
		return specialiteRepository.save(t);
	}

		public void deleteById(int t) {

		specialiteRepository.deleteById(t);
		
	}

	
	public void update2(int t) {

		
		specialiteRepository.save(findById(t));
		
	}

	@Override
	public void delete(Specialite t) {
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public void update(Specialite t) {
		// TODO Auto-generated method stub
		
	}



	
	
	

}
