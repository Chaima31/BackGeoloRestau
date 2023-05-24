package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Ville;
import com.example.demo.entity.Zone;





public interface ZoneRepository extends JpaRepository<Zone, Long> {
	List<Zone> findAll();
	Zone findByNomAndVille_Nom(String nomZone, String nomVille);
    List<Zone> findByVille(Ville ville);
	Zone findBynom(String nom);
	Zone findByid(Integer id);
}