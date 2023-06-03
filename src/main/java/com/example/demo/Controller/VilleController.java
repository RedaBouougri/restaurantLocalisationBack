package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.example.demo.service.VilleService;


@RequestMapping("api/villes")
@RestController
@CrossOrigin("*")
public class VilleController {

	@Autowired
	VilleService villeService;
	
	
	@GetMapping("/all")
	public List<Ville> findAll() {
		return villeService.findAll();
	}

	@GetMapping("/findbyid/{id}")
	public Ville findById(@PathVariable int id) {
		return villeService.findById(id);
	}
	
	@GetMapping("/findbynom/{nom}")
	public Ville findByNom(@PathVariable String nom) {
		return villeService.findByNom(nom);
	}
	
	@PostMapping("/save")
	public Ville save(@RequestBody Ville t) {
		return villeService.save(t);
	}

	/*@DeleteMapping("/delete")
	public void delete(@RequestBody Ville t) {
		villeService.delete(t);
	}*/

	/*@PutMapping("/update")
	public void update(@RequestBody Ville t) {
		villeService.update(t);
	}*/
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		villeService.deleteById(id);
	}

	@PutMapping("/update/{id}")
	public Ville update(@PathVariable int id, @RequestBody Specialite sp) {
		Ville existingville = villeService.findById(id);
        if (existingville!=null) {
        	existingville.setNom(sp.getNom());
            return villeService.save(existingville);
        }
        return null;
		
	}
	
	
	
	
}
