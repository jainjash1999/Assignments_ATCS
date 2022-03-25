package com.dtm.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtm.dao.TraineeDao;
import com.dtm.entity.Trainee;

@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	TraineeDao dao;

	@Override
	public Trainee addtrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return dao.save(trainee);
	}

	@Override
	public Trainee updatetrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return dao.save(trainee);
	}

	@Override
	public void deletetrainee(int traineeId) {

		dao.deleteById(traineeId);
	}

	@Override
	public Optional<Trainee> gettrainee(int traineeId) {
		// TODO Auto-generated method stub
		return dao.findById(traineeId);
	}

	@Override
	public Iterable<Trainee> getAlltrainees() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}