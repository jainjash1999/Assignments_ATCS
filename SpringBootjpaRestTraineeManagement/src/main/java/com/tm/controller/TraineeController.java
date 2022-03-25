package com.tm.controller;

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

import com.tm.entity.Trainee;
import com.tm.service.TraineeService;

@RestController
@RequestMapping("/trainee")
public class TraineeController {

	@Autowired
	TraineeService service;
	
	@PostMapping("/addtrainee")   // http://localhost:5555/trainee/addtrainee
	public Trainee addtrainee(@RequestBody Trainee emp) {
		return service.addtrainee(emp);
	}
	
	@PutMapping("/updatetrainee")	//		http://localhost:5555/trainee/updatetrainee
	public Trainee updatetrainee(@RequestBody Trainee emp) {
		return service.updatetrainee(emp);
	}
	
	@GetMapping("/gettrainee/{eid}")		// http://localhost:5555/trainee/gettrainee/eid
	public Trainee gettrainee(@PathVariable("eid") int empId) {
		return service.gettrainee(empId);
	}
	
	@GetMapping("/getAlltrainees")		// http://localhost:5555/trainee/getAlltrainees
	public List<Trainee> getAlltrainees() {
		return service.getAlltrainees();
	}
	
	@DeleteMapping("/deletetrainee/{eid}")		// http://localhost:5555/trainee/deletetrainee/124
	public String deletetrainee(@PathVariable("eid") int empId) {
		return service.deletetrainee(empId);
	}
	
	

}
