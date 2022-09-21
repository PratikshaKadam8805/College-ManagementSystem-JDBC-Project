package com.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.service.CollegeService;

public class CollegeMain 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Welcome to College Manageme1nt");
		System.out.println("1.View College Student Data");
		System.out.println("2.Insert New College Student Data");
		System.out.println("3.Update College Student Data");
		System.out.println("4.Delete College Student data");
		System.out.println("5.View College Staff Data");
		System.out.println("6.Insert New College Staff Data");
		System.out.println("7.Update College Staff Data");
		System.out.println("8.Delete College Staff data");

		do
		{
		System.out.println("enter the choice");
		
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			new CollegeService().viewCollegeStudent();
			break;
		
		case 2:
			new CollegeService().insertCollegeStudent();
			break;
		
		case 3:
			new CollegeService().updateCollegeStudent();
			break;
		
		case 4:
			new CollegeService().deleteCollegeStudent();
			break;
		case 5:
			new CollegeService().viewCollegeStaff();
			break;
		case 6:
			new CollegeService().insertCollegeStaff(); 
			break;
		case 7:
			new CollegeService().updateCollegeStaff();
			break;
		case 8:
			new CollegeService().deleteCollegeStaff();
			break;
		}
		System.out.println("do you want to continue");
        s=sc.next();
		}
		while(s.equals("y"));
	}
}
