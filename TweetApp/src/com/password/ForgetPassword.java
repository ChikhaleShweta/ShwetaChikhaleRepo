package com.password;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connection.ConnectionProvider;
import com.register.login.User;

public class ForgetPassword {

	public static boolean forgetPass(String email1,String password1) {
		boolean status = false; 
		Connection con = ConnectionProvider.CreateC();
	           try {
					String Query2 = ("update user set password = ? where email = ?");
					PreparedStatement pstmt1 = con.prepareStatement(Query2);
			
					pstmt1.setString(1, password1);
					pstmt1.setString(2, email1);
					
					if(pstmt1.executeUpdate()==1) {
						System.out.println("updated");
					}
					con.close();
					pstmt1.close();

					status = true;
				} catch (Exception e) {
					System.out.println(e);
				}
		return status;

	}
}
