package com.entity;

public class CollegeStudent 
{
	private int sid;
	private String sname;
	private String deptname;
	private String address;
	private int marks;
	private int age;
	public CollegeStudent() 
	{
		
	}
	public CollegeStudent(int sid, String sname, String deptname, String address, int marks, int age)
	{
		super();
		this.sid = sid;
		this.sname = sname;
		this.deptname = deptname;
		this.address = address;
		this.marks = marks;
		this.age = age;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}