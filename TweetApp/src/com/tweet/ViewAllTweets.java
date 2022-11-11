package com.tweet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connection.ConnectionProvider;

public class ViewAllTweets {

	public static boolean getAllTweets() {
		boolean status = false;
		try {

			Connection con = ConnectionProvider.CreateC();
			String Query1 = "select posttweet from tweet";
			PreparedStatement pstmt = con.prepareStatement(Query1);

			// execute the query
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				//System.out.println(rs.getInt(1));
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
