package com.training.entity;

public class Doctor {
	int id;
	String name;
	String qualification;
	double fee;
	int experience;
	String gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Doctor(int id, String name, String qualification, double fee,
			int experience, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.fee = fee;
		this.experience = experience;
		this.gender = gender;
	}
	public Doctor() {
		super();
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", qualification="
				+ qualification + ", fee=" + fee + ", experience=" + experience
				+ ", gender=" + gender + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

}
