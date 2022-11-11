package com.register.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.tweet.Tweet;
import com.connection.ConnectionProvider;
import com.tweet.PostTweet;

public class LoginUser {

	public static boolean loginUser(User u) {
		String email1=u.getEmail();
		String password1=u.getPassword();
		boolean status = false;
		String email = null, password = null;
		try {

			Connection con = ConnectionProvider.CreateC();
			String Query1 = "select email,password from user";
			PreparedStatement pstmt = con.prepareStatement(Query1);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				email = rs.getString(1);
				password = rs.getString(2);
				
				if (email1.equals(email) && password1.equals(password)) {
					status = true;
				}
			}
			
		}

		catch (Exception e) {
			System.out.println(e);
		}
		return status;

	}

}
