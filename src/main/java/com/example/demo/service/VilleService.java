package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Repository.VilleRepository;
import com.example.demo.Repository.ZoneRepository;
import com.example.demo.entity.Ville;
import com.example.demo.entity.Zone;
import com.example.demo.idao.IDao;

@Service
public class VilleService implements IDao<Ville> {

	@Autowired
	VilleRepository villeRepository;
	@Autowired
	ZoneRepository zoneRepository;

	@Override
	public List<Ville> findAll() {
		return villeRepository.findAll();
	}

	@Override
	public Ville findById(int id) {

		return villeRepository.findById(id).get();
	}

	public Ville findByNom(String nom) {

		return villeRepository.findByNom(nom);
	}

	@Override
	public Ville save(Ville t) {
		// TODO Auto-generated method stub
		return villeRepository.save(t);
	}

	@Override
	public void delete(Ville t) {
		List<Zone> z1 = zoneRepository.findByVilleId(t.getId());
		for (Zone z : z1) {

			zoneRepository.delete(z);
		}

		villeRepository.delete(t);
	}
	
	public void deleteById(int t) {
		List<Zone> z1 = zoneRepository.findByVilleId(t);
		for (Zone z : z1) {

			zoneRepository.delete(z);
		}

		villeRepository.deleteById(t);
		
	}
	
		public void update2(int t) {

		
		villeRepository.save(findById(t));
		
	}
		
		

	@Override
	public void update(Ville t) {
		// TODO Auto-generated method stub
		villeRepository.save(t);
	}

}
