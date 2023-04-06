package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Resto;
import com.example.demo.service.RestoService;

@RestController
@RequestMapping("/api/restos")
public class RestoController {

	@Autowired
	RestoService restoService;

	@GetMapping("/")
	public List<Resto> findAll() {
		return restoService.findAll();
	}

	@GetMapping("/findbyid/{id}")
	public Resto findById(@PathVariable int id) {
		return restoService.findById(id);
	}


	@PostMapping("/save")
	public Resto save(@RequestBody Resto t) {
		return restoService.save(t);
	}

	@DeleteMapping("/delete")
	public void delete(@RequestBody Resto t) {
		restoService.delete(t);
	}

	@PutMapping("/update")
	public void update(@RequestBody Resto t) {
		restoService.update(t);
	}

	@GetMapping("/ville/zones/zone/restaurants/{zone}")
	public List<Resto> findByZone(@PathVariable String zone) {
		return restoService.findByZone(zone);
	}

	@GetMapping("/allresto/zone/{zone}/specialite/{spe}")
	public List<Resto> findRestoByZoneAndSpecialite(@PathVariable String zone,@PathVariable String spe) {
		return restoService.findRestoByZoneAndSpecialite(zone,spe);
	}

	@GetMapping("/allresto/zone/{zone}/serie/{serie}")
	public List<Resto> findRestoByZoneAndSerie(@PathVariable String zone,@PathVariable String serie) {
		return restoService.findRestoByZoneAndSerie(zone, serie);
	}
	
	
	
	

}
