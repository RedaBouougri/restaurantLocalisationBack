package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Resto;
import com.example.demo.entity.Ville;
@Repository
public interface VilleRepository extends JpaRepository<Ville, Integer>{
	
	Ville findByNom(String nom);
	
	

}
