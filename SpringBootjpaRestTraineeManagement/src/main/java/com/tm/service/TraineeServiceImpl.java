package com.tm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tm.dao.TraineeDao;
import com.tm.entity.Trainee;

@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	TraineeDao dao;

	@Override
	public Trainee addtrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return dao.addtrainee(trainee);
	}

	@Override
	public Trainee updatetrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return dao.updatetrainee(trainee);
	}

	@Override
	public String deletetrainee(int traineeId) {
		// TODO Auto-generated method stub
		return dao.deletetrainee(traineeId);
	}

	@Override
	public Trainee gettrainee(int traineeId) {
		// TODO Auto-generated method stub
		return dao.gettrainee(traineeId);
	}

	@Override
	public List<Trainee> getAlltrainees() {
		// TODO Auto-generated method stub
		return dao.getAlltrainees();
	}

	

}