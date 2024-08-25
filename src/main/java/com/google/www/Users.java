package com.google.www;

public class Users {
	
	String roll_no,deptId;

	public Users(int id2, String name2, int roll) {
		// TODO Auto-generated constructor stub
		this.id = id2;
		this.name = name2;
		this.rollno = roll;
		
	}
	
	public Users(int id2, String name2, int roll,int dept_id) {
		// TODO Auto-generated constructor stub
		this.id = id2;
		this.name = name2;
		this.rollno = roll;
		this.dept_id = dept_id;
		
	}
	
	public Users(int id2, String name2, String roll,String dept_id) {
		// TODO Auto-generated constructor stub
		this.id = id2;
		this.name = name2;
		this.roll_no = roll;
		this.deptId = dept_id;
		
	}
	public Users() {
	
	}
	
	
	public String toString() {
		return this.id+","+this.name+","+this.rollno;
	}
	int id,rollno,dept_id;
	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(String dept_id2) {
		this.dept_id = dept_id;
	}

	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(String rollno2) {
		this.rollno = rollno2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	String name;

}
