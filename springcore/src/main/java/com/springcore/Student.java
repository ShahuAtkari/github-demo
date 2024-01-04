package com.springcore;

public class Student {
	private int roll;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGradeName() {
		return gradeName;
	}
	public void setGradeName(int gradeName) {
		this.gradeName = gradeName;
	}
	private String name;
	private int gradeName;
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", gradeName=" + gradeName + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, int gradeName) {
		super();
		this.roll = roll;
		this.name = name;
		this.gradeName = gradeName;
	}
	
	

}
