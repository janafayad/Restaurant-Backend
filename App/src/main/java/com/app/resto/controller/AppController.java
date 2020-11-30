package com.app.resto.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.app.resto.model.*;

import com.app.resto.service.RestoService;

@RequestMapping("/postgres")
@RestController
@CrossOrigin(origins="http://localhost:3000")

public class AppController {

	@Autowired
	private RestoService restoService;
	
	@GetMapping("/restos")
	public List<Resto> getAllRestos(){
		return restoService.getAllRestos();
	}
	
	@GetMapping("/visits")
	public List<Visits> getAllVisits(){
		return restoService.getAllVisits();
	}
	
	@PostMapping("/addVisits")
    public void addVisits(@RequestBody Visits visited){
		restoService.addVisits(visited);
    }
	
	
//    public List<Resto> findRestos(Model model) {
//
//        List<Resto> restos = (List<Resto>) restoService.findAll();
//
//        model.addAttribute("restos", restos);
//
//        return restos;
//    }
	
}
