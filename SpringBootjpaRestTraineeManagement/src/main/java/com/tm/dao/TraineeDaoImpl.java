package com.tm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tm.entity.Trainee;

@Repository
public class TraineeDaoImpl implements TraineeDao {

	@PersistenceContext
	EntityManager entity;

	@Override
	public Trainee addtrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		entity.persist(trainee);
		return entity.find(Trainee.class, trainee.gettraineeId());
	}

	@Override
	public Trainee updatetrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return entity.merge(trainee);
	}

	@Override
	public String deletetrainee(int traineeId) {
		// TODO Auto-generated method stub
		Trainee trainee = entity.find(Trainee.class, traineeId);

		if (trainee != null) {
			entity.remove(trainee);
			return "trainee deleted";
		} else {
			return "no trainee found";
		}

	}

	@Override
	public Trainee gettrainee(int traineeId) {
		// TODO Auto-generated method stub
		return entity.find(Trainee.class, traineeId);
	}

	@Override
	public List<Trainee> getAlltrainees() {
		// TODO Auto-generated method stub

		TypedQuery<Trainee> result = entity.createQuery("select e from Trainee e", Trainee.class);
		return result.getResultList();

	}

	

}