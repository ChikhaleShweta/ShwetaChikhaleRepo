package com.register.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connection.ConnectionProvider;

public class ViewAllUsers {

	public static boolean getAllUsers() {
		boolean status = false;
		try {

			Connection con = ConnectionProvider.CreateC();
			String Query1 = "select name from user";
			PreparedStatement pstmt = con.prepareStatement(Query1);

			// execute the query
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {

				System.out.println(rs.getString(1));

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
