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

import com.example.demo.entity.Specialite;
import com.example.demo.entity.Ville;
import com.example.demo.service.SpecialiteService;




@RequestMapping("api/specialities")
@RestController
public class SpecialiteController {

	@Autowired
	SpecialiteService specialiteService;

	@GetMapping("/all")
	public List<Specialite> findAll() {
		return specialiteService.findAll();
	}

	@GetMapping("/findbyid/{id}")
	public Specialite findById(@PathVariable int id) {
		return specialiteService.findById(id);
	}

	@PostMapping("/save")
	public Specialite save(@RequestBody Specialite t) {
		return specialiteService.save(t);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		specialiteService.deleteById(id);
	}

	@PutMapping("/update/{id}")
	public Specialite update(@PathVariable int id, @RequestBody Specialite sp) {
		Specialite existingsp = specialiteService.findById(id);
        if (existingsp != null) {
        	existingsp.setNom(sp.getNom());
            return specialiteService.save(existingsp);
        }
        return null;
		
	}
	
	
	
	
}
