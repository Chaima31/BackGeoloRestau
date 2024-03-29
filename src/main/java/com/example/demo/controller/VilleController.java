package com.example.demo.controller;

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

import com.example.demo.ServiceImpl.VilleImpl;
import com.example.demo.entity.Ville;
import com.example.demo.entity.Zone;






@RestController
@RequestMapping("/api/villes")
public class VilleController {
     
    @Autowired
    VilleImpl villeimpl;
    
    @GetMapping(path =  "/{name}")
    public Ville getAllVilles(@PathVariable String name) {
        return villeimpl.GetByName(name);
    }
    
    @GetMapping
    public List<Ville> Getall(){
    	return villeimpl.GetAll();
    }
    
    @PostMapping
    public Ville Save(@RequestBody Ville ville) {
    	return villeimpl.Save(ville);
    }
    
    @DeleteMapping("/{id}")
    public void Delete(@PathVariable Integer id) {
    	villeimpl.Delete(id);
    }
    
    @PutMapping("/{id}")
    public Ville Update(@PathVariable Integer id,@RequestBody Ville ville) {
    	return villeimpl.Update(id, ville);
    }
    @GetMapping("/{nomVille}/zones")
    public List<Zone> getZonesByNomVille(@PathVariable String nomVille) {
        return villeimpl.getZonesByNomVille(nomVille);
    }
    
    
    
    
    
    
}