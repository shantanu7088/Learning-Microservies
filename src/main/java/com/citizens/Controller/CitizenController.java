package com.citizens.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.citizens.Entity.Citizen;
import com.citizens.Repo.CitizenRepository;

@RestController
@RequestMapping("/citizens")
public class CitizenController {
	
	@Autowired
	private CitizenRepository cr;
	
	@GetMapping("/citizen")
	public ResponseEntity<String> citizens()
	{
		return new ResponseEntity<>("hello",HttpStatus.OK);	
	}
	
	@GetMapping("/getCitizens/{id}")
	public ResponseEntity<List<Citizen>> getCitizens(@RequestParam int id)
	{
		List<Citizen> list= cr.findByvaccinationcenterid(id);
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@PostMapping("/addCitizen")
	public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen ct)
	{
		Citizen c=cr.save(ct);
		System.out.println(ct.toString());
		return new ResponseEntity<>(c,HttpStatus.OK);
	}

}
