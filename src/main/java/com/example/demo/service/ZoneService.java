package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.VilleRepository;
import com.example.demo.Repository.ZoneRepository;
import com.example.demo.entity.Ville;
import com.example.demo.entity.Zone;
import com.example.demo.idao.IDao;

@Service
public class ZoneService implements IDao<Zone> {

	@Autowired
	ZoneRepository zoneRepository;
	
	@Autowired
	private VilleRepository villeRepository;

	public Zone findByNom(String nom) {

		return zoneRepository.findByNom(nom);
	}

	public List<Zone> findByVilleNom(String nom) {

		Ville ville = villeRepository.findByNom(nom);

		return ville.getZone();
	}

	@Override
	public List<Zone> findAll() {

		return zoneRepository.findAll();
	}

	@Override
	public Zone findById(int id) {

		return zoneRepository.findById(id).get();
	}

	@Override
	public Zone save(Zone t) {

		return zoneRepository.save(t);
	}

	@Override
	public void delete(Zone t) {

		zoneRepository.delete(t);
	}

	@Override
	public void update(Zone t) {

		zoneRepository.save(t);

	};

}
