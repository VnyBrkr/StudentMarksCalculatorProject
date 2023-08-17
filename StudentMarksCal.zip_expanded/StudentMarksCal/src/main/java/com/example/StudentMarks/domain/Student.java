package com.example.StudentMarks.domain;

public class Student {

	
	private int m1;
	private int m2;
	private int m3;
	
	
	
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	
	public int getTotal() {
		return m1+m2+m3;
	}
	
	public double getAvg() {
		int total = m1+m2+m3;
		double avg = total/3;
		return avg;
	}
	
	
	public String getGrade() {
		int total = m1+m2+m3;
		double avg = total/3;
		String grade;
	
		
		if(avg>50) {
			grade = "Pass";
		}
		else {
			grade="fail";
		}
		return  grade;
	}
	
}
