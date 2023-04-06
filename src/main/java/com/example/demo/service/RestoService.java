package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.RestoRepository;
import com.example.demo.entity.Resto;
import com.example.demo.entity.Zone;
import com.example.demo.idao.IDao;

@Service
public class RestoService implements IDao<Resto> {

	@Autowired
	RestoRepository restoRepository;
	@Autowired
	ZoneService zoneService;

	@Override
	public List<Resto> findAll() {
		
		return restoRepository.findAll();
	}
	
	public List<Resto> findByZone(String zone){
		
		Zone zone1 = zoneService.findByNom(zone);
		
		return zone1.getResto();
	}

	@Override
	public Resto findById(int id) {
		
		return restoRepository.findById(id).get();
	}

	@Override
	public Resto save(Resto t) {
		
		return restoRepository.save(t);
	}

	@Override
	public void delete(Resto t) {
		
		restoRepository.delete(t);
		
	}

	@Override
	public void update(Resto t) {
		
		restoRepository.save(t);
		
	}

	public List<Resto> findRestoByZoneAndSpecialite(String zone,String spe) {
		
		return restoRepository.findRestoByZoneAndSpecialite(zone,spe);
	}

	public List<Resto> findRestoByZoneAndSerie(String zone, String serie) {
		return restoRepository.findRestoByZoneAndSerie(zone, serie);
	}
	
	
	
	
}
