package com.doa;

import java.sql.SQLException;
import java.util.List;
import com.entity.CollegeStaff;
import com.entity.CollegeStudent;

public interface CollegeDao 
{
	public List<CollegeStudent>viewCollegeStudent() throws ClassNotFoundException, SQLException;
	public void insertNewCollegeStudent(CollegeStudent c) throws ClassNotFoundException, SQLException;
	public void updateCollegeStudent(CollegeStudent c) throws ClassNotFoundException, SQLException;
    public void deleteCollegeStudent(CollegeStudent c) throws ClassNotFoundException, SQLException;
    
    public List<CollegeStaff>viewCollegeStaff() throws ClassNotFoundException, SQLException;
	public void insertNewCollegeStaff(CollegeStaff c1) throws ClassNotFoundException, SQLException;
	public void updateCollegeStaff(CollegeStaff c1) throws ClassNotFoundException, SQLException;
    public void deleteCollegeStaff(CollegeStaff c1) throws ClassNotFoundException, SQLException;
}
