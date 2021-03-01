package com.rakuten.oops.part7;

import java.util.ArrayList;



public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(101, "A", 90);
		Student s2=new Student(102, "A", 67);
		Student s3=new Student(103, "B", 45);
		Student s4=new Student(104, "C", 56);
		Student s5=new Student(105, "D", 70);
		ArrayList <Student> studList=new ArrayList <Student>();
		studList.add(s1);
		studList.add(s2);
		studList.add(s3);
		studList.add(s4);
		studList.add(s5);
		Student lastStudent=studList.stream().min((stud1,stud2)->(stud1.getMarks()<stud2.getMarks())?-1:1).get();
		System.out.println("Topper  is "+lastStudent.getStudName());
	}
	}

	class Student{
		private int studId;
		private String studName;
		private float marks;
		public Student(int studId, String studName, float marks) {
			super();
			this.studId = studId;
			this.studName = studName;
			this.marks = marks;
		}
		public int getStudId() {
			return studId;
		}
		public void setStudId(int studId) {
			this.studId = studId;
		}
		public String getStudName() {
			return studName;
		}
		public void setStudName(String studName) {
			this.studName = studName;
		}
		public float getMarks() {
			return marks;
		}
		public void setMarks(float marks) {
			this.marks = marks;
		}
		
	}
