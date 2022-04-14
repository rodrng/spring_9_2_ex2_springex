package com.javagyeongmin.ex;

public class Student {
	
	private String name;
	private int age;
	private int gradeNum; // 학년
	private int classNum; // 반
	
	public void getStudentInfo() { // 핵심 기능
		
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("학년 : " + getGradeNum());
		System.out.println("반 : " + getClassNum());

		//int a = 10/0; // 강제로 에러를 발생시켜 after throwing advice 확인
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(int gradeNum) {
		this.gradeNum = gradeNum;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	
	
	

}
