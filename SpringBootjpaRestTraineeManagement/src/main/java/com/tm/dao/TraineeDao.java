package com.tm.dao;

import java.util.List;

import com.tm.entity.Trainee;

public interface TraineeDao {
	
	Trainee addtrainee(Trainee trainee);

	Trainee updatetrainee(Trainee trainee);

	String deletetrainee(int traineeId);

	Trainee gettrainee(int traineeId);

	List<Trainee> getAlltrainees();

}
