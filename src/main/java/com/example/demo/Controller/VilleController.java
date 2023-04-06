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

import com.example.demo.entity.Ville;
import com.example.demo.service.VilleService;


@RequestMapping("api/villes")
@RestController
public class VilleController {

	@Autowired
	VilleService villeService;
	
	
	@GetMapping("/")
	public List<Ville> findAll() {
		return villeService.findAll();
	}

	@GetMapping("/findbyid/{id}")
	public Ville findById(@PathVariable int id) {
		return villeService.findById(id);
	}
	
	@PostMapping("/save")
	public Ville save(@RequestBody Ville t) {
		return villeService.save(t);
	}

	@DeleteMapping("/delete")
	public void delete(@RequestBody Ville t) {
		villeService.delete(t);
	}

	@PutMapping("/update")
	public void update(@RequestBody Ville t) {
		villeService.update(t);
	}
	
	
	
	
	
}
