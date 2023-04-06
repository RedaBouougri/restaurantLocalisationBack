package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Ville;
import com.example.demo.entity.Zone;
@Repository
public interface ZoneRepository extends JpaRepository<Zone, Integer>{

	Zone findByNom(String nom);
	
	List<Zone> findByVilleId(int id);
}
