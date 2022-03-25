package com.dtm.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtm.entity.Trainee;
import com.dtm.service.TraineeService;

@RestController
@RequestMapping("/Trainee")
public class TraineeController {

	@Autowired
	TraineeService service;
	
	@PostMapping("/addTrainee")   // http://localhost:5656/Trainee/addTrainee
	public Trainee addTrainee(@RequestBody Trainee trainee) {
		return service.addtrainee(trainee);
	}
	
	@PutMapping("/updateTrainee")	//		http://localhost:5656/Trainee/updateTrainee
	public Trainee updateTrainee(@RequestBody Trainee trainee) {
		return service.updatetrainee(trainee);
	}
	
	@GetMapping("/getTrainee/{tid}")		// http://localhost:5656/Trainee/getTrainee/eid
	public Optional<Trainee> getTrainee(@PathVariable("eid") int traineeId) {
		return service.gettrainee(traineeId);
	}
	
	@GetMapping("/getAllTrainees")		// http://localhost:5656/Trainee/getAllTrainees
	public Iterable<Trainee> getAllTrainees() {
		return service.getAlltrainees();
	}
	
	@DeleteMapping("/deleteTrainee/{tid}")		// http://localhost:5656/Trainee/deleteTrainee/124
	public void deleteTrainee(@PathVariable("tid") int traineeId) {
		 service.deletetrainee(traineeId);
	}
	
	

}
