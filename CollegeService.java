package com.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.doa.CollegeDaoImplementation;
import com.entity.CollegeStaff;
import com.entity.CollegeStudent;

public class CollegeService 
{
	public void viewCollegeStudent() throws ClassNotFoundException, SQLException
	{
		List<CollegeStudent>collegestudentlist=new CollegeDaoImplementation().viewCollegeStudent();
		for(CollegeStudent c:collegestudentlist)
		{
			
			System.out.println("=============================College Student Data================");
			System.out.print(c.getSid());
			System.out.print("\t"+ c.getSname());
			System.out.print("\t"+ c.getDeptname());
			System.out.print("\t"+ c.getAddress());
			System.out.print("\t"+ c.getMarks());
			System.out.println("\t"+ c.getAge());
			
		}
	}
	
	public void insertCollegeStudent() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the student id");
		int sid=sc.nextInt();
		System.out.println("enter the student name");
		String sname=sc.next();
		System.out.println("enter the student department name");
		String deptname=sc.next();
		System.out.println("enter the student address");
		String address=sc.next();
		System.out.println("enter the student marks");
		int marks=sc.nextInt();
		System.out.println("enter the student age");
		int age=sc.nextInt();
		
		CollegeStudent c=new CollegeStudent();
		c.setSid(sid);
		c.setSname(sname);
		c.setDeptname(deptname);
		c.setAddress(address);
		c.setMarks(marks);
		c.setAge(age);
		
		new CollegeDaoImplementation().insertNewCollegeStudent(c);
	}

	public void updateCollegeStudent() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the student name");
		String sname=sc.next();
		System.out.println("enter the student department name");
		String deptname=sc.next();
		System.out.println("enter the student address");
		String address=sc.next();
		System.out.println("enter the student marks");
		int marks=sc.nextInt();
		System.out.println("enter the student age");
		int age=sc.nextInt();
		System.out.println("enter the student id");
		int sid=sc.nextInt();
		
		CollegeStudent c=new CollegeStudent();
		
		c.setSname(sname);
		c.setDeptname(deptname);
		c.setAddress(address);
		c.setMarks(marks);
		c.setAge(age);
		c.setSid(sid);
		new CollegeDaoImplementation().updateCollegeStudent(c);
	}
	public void deleteCollegeStudent() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the student id");
		int sid=sc.nextInt();
		CollegeStudent c=new CollegeStudent();
		c.setSid(sid);
		new CollegeDaoImplementation().deleteCollegeStudent(c);
		
	}
	
	public void viewCollegeStaff() throws ClassNotFoundException, SQLException
	{
		List<CollegeStaff> collegestaffList =new CollegeDaoImplementation().viewCollegeStaff();
		for(CollegeStaff c1:collegestaffList)
		{
			System.out.println("=============================College Staff Data================");
			System.out.print(c1.getStaffid());
			System.out.print("\t"+ c1.getStaffname());
			System.out.print("\t"+ c1.getStaffdeptname());
			System.out.print("\t"+ c1.getAddress());
			System.out.print("\t"+ c1.getMobileno());
			System.out.println("\t"+ c1.getSalary());
		}
	}
	
	public void insertCollegeStaff() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the staff id");
		int staffid=sc.nextInt();
		System.out.println("enter the staff name");
		String staffname=sc.next();
		System.out.println("enter the staff department name");
		String staffdeptname=sc.next();
		System.out.println("enter the staff address");
		String address=sc.next();
		System.out.println("enter the staff mobile number");
		long mobileno=sc.nextLong();
		System.out.println("enter the staff salary");
		double salary=sc.nextInt();
		
		CollegeStaff c1=new CollegeStaff();
		c1.setStaffid(staffid);
		c1.setStaffname(staffname);
		c1.setStaffdeptname(staffdeptname);
		c1.setAddress(address);
		c1.setMobileno(mobileno);
		c1.setSalary(salary);
		
		new CollegeDaoImplementation().insertNewCollegeStaff(c1); 
	}
	
	public void updateCollegeStaff() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter the staff name");
		String staffname=sc.next();
		System.out.println("enter the staff department name");
		String staffdeptname=sc.next();
		System.out.println("enter the staff address");
		String address=sc.next();
		System.out.println("enter the staff mobile number");
		long mobileno=sc.nextLong();
		System.out.println("enter the staff salary");
		double salary=sc.nextInt();
		System.out.println("enter the staff id");
		int staffid=sc.nextInt();
		
		CollegeStaff c1=new CollegeStaff();
		
		c1.setStaffname(staffname);
		c1.setStaffdeptname(staffdeptname);
		c1.setAddress(address);
		c1.setMobileno(mobileno);
		c1.setSalary(salary);
		c1.setStaffid(staffid);
		
		new CollegeDaoImplementation().insertNewCollegeStaff(c1); 
	}
	
	public void deleteCollegeStaff() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the staff id");
		int staffid=sc.nextInt();
		CollegeStaff c1=new CollegeStaff();
		c1.setStaffid(staffid);
		new CollegeDaoImplementation().insertNewCollegeStaff(c1); 
	}
}
