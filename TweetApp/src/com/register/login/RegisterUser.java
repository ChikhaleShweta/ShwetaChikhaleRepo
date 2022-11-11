package com.register.login;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.connection.ConnectionProvider;

public class RegisterUser {

	public static boolean addUserToDB(User u) {
		boolean status = false;
		try {

			Connection con = ConnectionProvider.CreateC();
			String Query1 = "insert into user(name,email,password)" + "values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(Query1);

			// Setting values to the parameter
			pstmt.setString(1, u.getName());
			pstmt.setString(2, u.getEmail());
			pstmt.setString(3, u.getPassword());

			// execute the query
			pstmt.executeUpdate();
			status = true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

}
