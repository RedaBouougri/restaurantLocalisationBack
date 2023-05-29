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

import com.example.demo.entity.Serie;
import com.example.demo.entity.Specialite;
import com.example.demo.entity.Ville;
import com.example.demo.service.SerieService;

@RequestMapping("/api/series")
@RestController
public class SerieController {
	
	@Autowired
	SerieService serieService;

	@GetMapping("/all")
	public List<Serie> findAll() {
		return serieService.findAll();
	}
	@GetMapping("/findbyid/{id}")
	public Serie findById(@PathVariable int id) {
		return serieService.findById(id);
	}

	@PostMapping("/save")
	public Serie save(@RequestBody Serie t) {
		return serieService.save(t);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		serieService.delete(id);
	}

	@PutMapping("/update/{id}")
	public Serie update(@PathVariable int id, @RequestBody Serie sp) {
		Serie existingserie = serieService.findById(id);
        if (existingserie!=null) {
        	existingserie.setNom(sp.getNom());
            return serieService.save(existingserie);
        }
        return null;
		
	}
	
	
	

}
