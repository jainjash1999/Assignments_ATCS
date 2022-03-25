package com.tm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sbjparesttrainee")
public class Trainee {

	@Id
	@Column(name = "tid", length = 10)
	private int traineeId;
	@Column(name = "tname", length = 15)
	private String traineeName;
	@Column(name = "tsal", length = 10)
	private int traineeSal;
	@Column(name = "tadd", length = 15)
	private String traineeAdd;

	public int gettraineeId() {
		return traineeId;
	}

	public void settraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String gettraineeName() {
		return traineeName;
	}

	public void settraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public int gettraineeSal() {
		return traineeSal;
	}

	public void settraineeSal(int traineeSal) {
		this.traineeSal = traineeSal;
	}

	public String gettraineeAdd() {
		return traineeAdd;
	}

	public void settraineeAdd(String traineeAdd) {
		this.traineeAdd = traineeAdd;
	}

	public Trainee() {
		// TODO Auto-generated constructor stub
	}

	public Trainee(int traineeId, String traineeName, int traineeSal, String traineeAdd) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeSal = traineeSal;
		this.traineeAdd = traineeAdd;
	}

	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", traineeSal=" + traineeSal + ", traineeAdd=" + traineeAdd + "]";
	}

}
