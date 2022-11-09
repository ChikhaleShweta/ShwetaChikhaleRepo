package com.start.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class StudentDao {
	public static boolean addStudentToDB(Student st) {
		boolean status = false;
		try {

			Connection con = ConnectionProvider.CreateC();
			String Query1 = "insert into students(sname,phone,scity)" + "values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(Query1);

			// Setting values to the parameter
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());

			// execute the query
			pstmt.executeUpdate();
			status = true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public static boolean deleteStudent(Integer studentId) {
		boolean status = false;
		try {

			Connection con = ConnectionProvider.CreateC();
			String Query1 = "delete from students where sid=?";
			PreparedStatement pstmt = con.prepareStatement(Query1);

			// Setting values to the parameter
			pstmt.setInt(1, studentId);

			// execute the query
			pstmt.executeUpdate();
			status = true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;

	}

	public static boolean getAllStudents() {
		boolean status = false;
		try {

			Connection con = ConnectionProvider.CreateC();
			String Query1 = "select*from students";
			PreparedStatement pstmt = con.prepareStatement(Query1);

			// execute the query
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("City= " + rs.getInt(1));
				System.out.println("Name= " + rs.getString(2));
				System.out.println("Phone= " + rs.getInt(3));
				System.out.println("City= " + rs.getString(4));
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

			}
			con.close();
			rs.close();
			pstmt.close();
			status = true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;

	}

}
