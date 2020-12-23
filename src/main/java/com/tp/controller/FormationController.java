package com.tp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp.model.Formation;
import com.tp.repository.FormationRepository;

@RestController
public class FormationController {

	@Autowired
	FormationRepository formationRepository;
	
	@GetMapping("formation")
	public List<Formation> getFormations()
	{
		return (List<Formation>) formationRepository.findAll();
		
		
	}
	
	
	
}
