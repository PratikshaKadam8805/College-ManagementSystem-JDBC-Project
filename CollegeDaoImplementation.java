package com.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.CollegeStaff;
import com.entity.CollegeStudent;

public class CollegeDaoImplementation implements CollegeDao 
{

	@Override
	public List<CollegeStudent> viewCollegeStudent() throws ClassNotFoundException, SQLException {
		ArrayList<CollegeStudent>collegestudentList=new ArrayList<CollegeStudent>();
		Class.forName("com.mysql.cj.jdbc.Driver");//load the driver
		//create the connection 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","root");
		//create the statement
		PreparedStatement statement =con.prepareStatement("select * from CollegeStudent");
		ResultSet rs=statement.executeQuery();
		
		while(rs.next())
		{
			CollegeStudent c=new CollegeStudent();
			/*System.out.println("=============================College Student Data================");
			System.out.print("\t"+(rs.getInt(1)));
			System.out.print("\t"+(rs.getString(2)));
			System.out.print("\t"+(rs.getString(3)));
			System.out.print("\t"+(rs.getString(4)));
			System.out.print("\t"+(rs.getInt(5)));
			System.out.print("\t"+(rs.getInt(6)));
			System.out.println("");
			*/
			c.setSid(rs.getInt(1));
			c.setSname(rs.getString(2));
			c.setDeptname(rs.getString(3));
			c.setAddress(rs.getString(4));
			c.setMarks(rs.getInt(5));
			c.setAge(rs.getInt(6));
			collegestudentList.add(c);
		}
		return collegestudentList;
	}
	@Override
	public void insertNewCollegeStudent(CollegeStudent c) throws ClassNotFoundException, SQLException {
		int row=0;
		Class.forName("com.mysql.cj.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","root");
		PreparedStatement statement =con.prepareStatement("insert into CollegeStudent values(?,?,?,?,?,?)");
		statement.setInt(1, c.getSid());
		statement.setString(2, c.getSname());
		statement.setString(3, c.getDeptname());
		statement.setString(4, c.getAddress());
		statement.setInt(5, c.getMarks());
		statement.setInt(6, c.getAge());
		row=statement.executeUpdate();
		System.out.println("Inserted successfully");
	}

	@Override
	public void updateCollegeStudent(CollegeStudent c) throws ClassNotFoundException, SQLException {
		int row=0;
		Class.forName("com.mysql.cj.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","root");
		PreparedStatement statement =con.prepareStatement("update CollegeStudent set sname=?,deptname=? adderess=?,marks=?,age=? where sid=?");
		
		statement.setString(1, c.getSname());
		statement.setString(2, c.getDeptname());
		statement.setString(3, c.getAddress());
		statement.setInt (4, c.getMarks());
		statement.setInt(5, c.getAge());
		statement.setInt(6, c.getSid());
		row=statement.executeUpdate();
		System.out.println("updated successfully");
	}

	@Override
	public void deleteCollegeStudent(CollegeStudent c) throws ClassNotFoundException, SQLException {
		int row=0;
		Class.forName("com.mysql.cj.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","root");
		PreparedStatement statement =con.prepareStatement("delete from CollegeStudent where sid=?");
		statement.setInt(1, c.getSid());
		row=statement.executeUpdate();
		System.out.println("deleted successfully");
	}

	@Override
	public List<CollegeStaff> viewCollegeStaff() throws ClassNotFoundException, SQLException {
		ArrayList<CollegeStaff>collegestaffList=new ArrayList<CollegeStaff>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","root");
		
		PreparedStatement statement =con.prepareStatement("select * from CollegeStaff");
		ResultSet rs=statement.executeQuery();
		
		while(rs.next())
		{
			CollegeStaff c1=new CollegeStaff();
			/*
			System.out.print("\t"+(rs.getInt(1)));
			System.out.print("\t"+(rs.getString(2)));
			System.out.print("\t"+(rs.getString(3)));
			System.out.print("\t"+(rs.getString(4)));
			System.out.print("\t"+(rs.getLong(5)));
			System.out.print("\t"+(rs.getDouble(6)));
			System.out.println("");
			*/
			c1.setStaffid(rs.getInt(1));
			c1.setStaffname(rs.getString(2));
			c1.setStaffdeptname(rs.getString(3));
			c1.setAddress(rs.getString(4));
			c1.setMobileno(rs.getLong(5));
			c1.setSalary(rs.getDouble(6));
			collegestaffList.add(c1);
		}
		return collegestaffList;
	}

	@Override
	public void insertNewCollegeStaff(CollegeStaff c1) throws ClassNotFoundException, SQLException {
		int row=0;
		Class.forName("com.mysql.cj.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","root");
		PreparedStatement statement =con.prepareStatement("insert into CollegeStaff values(?,?,?,?,?,?)");
		statement.setInt(1, c1.getStaffid());
		statement.setString(2, c1.getStaffname());
		statement.setString(3, c1.getStaffdeptname());
		statement.setString(4, c1.getAddress());
		statement.setLong(5, c1.getMobileno());
		statement.setDouble(6, c1.getSalary());
		row=statement.executeUpdate();
		System.out.println("Inserted successfully");
	}

	@Override
	public void updateCollegeStaff(CollegeStaff c1) throws ClassNotFoundException, SQLException {
		int row=0;
		Class.forName("com.mysql.cj.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","root");
		PreparedStatement statement =con.prepareStatement("update CollegeStaff set staffname=?,staffdeptname=? adderess=?,mobile=?,salary=? where staffid=?");
		
		statement.setString(1, c1.getStaffname());
		statement.setString(2, c1.getStaffdeptname());
		statement.setString(3, c1.getAddress());
		statement.setLong(5, c1.getMobileno());
		statement.setDouble(5, c1.getSalary());
		statement.setInt(6, c1.getStaffid());
		row=statement.executeUpdate();
		System.out.println("updated successfully");
	}

	@Override
	public void deleteCollegeStaff(CollegeStaff c1) throws ClassNotFoundException, SQLException {
		int row=0;
		Class.forName("com.mysql.cj.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","root");
		PreparedStatement statement =con.prepareStatement("delete from CollegeStaff where staffid=?");
		statement.setInt(1, c1.getStaffid());
		row=statement.executeUpdate();
		System.out.println("deleted successfully");
	}
}