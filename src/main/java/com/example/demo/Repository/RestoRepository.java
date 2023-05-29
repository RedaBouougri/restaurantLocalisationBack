package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Resto;

@Repository
public interface RestoRepository extends JpaRepository<Resto, Integer>{
	
	@Query("select distinct r from Resto r join r.zone z join r.specialite s  where  z.nom=:noma  and s.nom=:nom ")
	List<Resto> findRestoByZoneAndSpecialite(@Param("noma") String zone,@Param("nom") String spec);
	
	@Query("select distinct r from Resto r where r.zone.nom=:noma  and r.serie.nom=:nom")
	List<Resto> findRestoByZoneAndSerie(@Param("noma") String zone,@Param("nom") String serie);
	
	@Query("SELECT r FROM Resto r JOIN r.zone z JOIN z.ville v WHERE v.nom =?1 AND z.nom =?2")
	 List<Resto> findRestoByVilleAndZone(String ville, String zone);
	
	@Query("SELECT r FROM Resto r JOIN r.zone z JOIN z.ville  v JOIN r.serie s WHERE v.nom =?1 AND z.nom =?2 and s.nom=?3")
	 List<Resto> findRestoByVilleAndZoneAndSerie(String ville, String zone,String serie);

}
