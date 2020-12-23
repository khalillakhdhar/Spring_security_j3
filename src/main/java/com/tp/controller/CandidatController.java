package com.tp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tp.model.Candidat;
import com.tp.repository.CandidatRepository;

@RestController
public class CandidatController {

	@Autowired
	CandidatRepository candidatRepository;
	
	@GetMapping("candidat")
	public List<Candidat> getCandidats()
	{
		return (List<Candidat>) candidatRepository.findAll();
		
		
	}
	@PostMapping("candidats")
	public Candidat addCandidat(@Valid @RequestBody Candidat candidat)
	{
		String ccode=candidat.getCode();
		String hashcode=new BCryptPasswordEncoder().encode(ccode);
		candidat.setCode(hashcode);
		return candidatRepository.save(candidat);
		
	}
}
