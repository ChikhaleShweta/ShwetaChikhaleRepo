package com.start.student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
	public static boolean addStudentToDB(Student st) {
		boolean status=false;
		try {
			
			Connection con=ConnectionProvider.CreateC();
			String Query1="insert into students(sname,phone,scity)"+"values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(Query1);
			
			//Setting values to the parameter
			pstmt.setString(1,st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			//execute the query
			pstmt.executeUpdate();
			status=true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return  status;
	}

}
