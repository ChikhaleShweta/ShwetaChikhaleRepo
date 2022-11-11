package com.tweet;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.connection.ConnectionProvider;

public class PostTweet {

	public static boolean addTweetToDB(Tweet p) {
		boolean status = false;
		try {

			Connection con = ConnectionProvider.CreateC();
			String Query1 = "insert into tweet(posttweet,email,name)" + "values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(Query1);

			// Setting values to the parameter
			pstmt.setString(1, p.getPostTweet());
			pstmt.setString(2, p.getEmail());
			pstmt.setString(3, p.getName());

			// execute the query
			pstmt.executeUpdate();
			status = true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

}
