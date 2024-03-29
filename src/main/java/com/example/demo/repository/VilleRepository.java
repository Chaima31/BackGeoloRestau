package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Ville;





@Repository
public interface VilleRepository extends JpaRepository<Ville, Integer> {

	List<Ville> findAll();
	Ville findBynom(String nom);
	Ville findByid(Integer id);
}
