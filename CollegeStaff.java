package com.entity;

public class CollegeStaff 
{
	private int staffid;
	private String staffname;
	private String staffdeptname;
	private String address;
	private long mobileno;
	private double salary;
	
	public CollegeStaff()
	{
		
	}
	public CollegeStaff(int staffid, String staffname, String staffdeptname, String address, long mobileno,double salary) 
	{
		super();
		this.staffid = staffid;
		this.staffname = staffname;
		this.staffdeptname = staffdeptname;
		this.address = address;
		this.mobileno = mobileno;
		this.salary = salary;
	}

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getStaffname() {
		return staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}

	public String getStaffdeptname() {
		return staffdeptname;
	}

	public void setStaffdeptname(String staffdeptname) {
		this.staffdeptname = staffdeptname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}