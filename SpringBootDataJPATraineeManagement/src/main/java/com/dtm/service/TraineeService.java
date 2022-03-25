package com.dtm.service;

import java.util.Optional;

import com.dtm.entity.Trainee;

public interface TraineeService {

	Trainee addtrainee(Trainee trainee);

	Trainee updatetrainee(Trainee trainee);

	void deletetrainee(int traineeId);

	Optional<Trainee> gettrainee(int traineeId);

	Iterable<Trainee> getAlltrainees();

}
