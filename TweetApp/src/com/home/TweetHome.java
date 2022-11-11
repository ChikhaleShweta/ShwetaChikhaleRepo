package com.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.password.ForgetPassword;
import com.register.login.LoginUser;
import com.register.login.RegisterUser;
import com.register.login.User;
import com.register.login.ViewAllUsers;
import com.tweet.Tweet;
import com.tweet.PostTweet;
import com.tweet.ViewAllTweets;
import com.tweet.ViewMyTweets;

public class TweetHome {

	public static void main(String[] args) throws IOException {
		System.out.println(">>>Welcome to TweetApp..!!!<<<");
		System.out.println("............................................................");

		Scanner sc = new Scanner(System.in);
		System.out.println("If you are new User press 1");
		System.out.println("If you are old User press 2");
		System.out.println("Forget password press 3");
		System.out.println("Exit>>> press 4");

		int no = sc.nextInt();
		System.out.println("............................................................");

		if (no == 1) {

			// Add New User
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter your name>>");
			String name = sc1.next();
			System.out.println("Enter your Email Id>>");
			String email = sc1.next();
			System.out.println("Enter your password>>");
			String password = sc1.next();

			User user = new User(name, email, password);
			System.out.println(user);
			boolean answer = RegisterUser.addUserToDB(user);
			if (answer) {
				System.out.println("User data added sucessfully");
				System.out.println("............................................................");
			} else {
				System.out.println("User data not added");
				System.out.println("............................................................");
			}

			// Login User

			System.out.println(">>>Please Login for using tweet App<<<");
			System.out.println("Enter your Email Id>>");
			String email1 = sc1.next();
			System.out.println("Enter your password>>");
			String password1 = sc1.next();

			User user1 = new User(email1, password1);
			// System.out.println(user);
			boolean answer1 = LoginUser.loginUser(user);
			if (answer1) {
				System.out.println("User login successfully");
				System.out.println("............................................................");
      while(true) {
				System.out.println("If you want to post tweet then press 11");
				System.out.println("View My tweets press 22");
				System.out.println("View All tweets press 33");
				System.out.println("View All Users press 44");
				//System.out.println("Exit>>> press 55");

				int num = sc.nextInt();
				System.out.println("............................................................");

				if (num == 11) {
					// Post Tweet
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					
					System.out.println("Enter your Tweet>>");
					String tweet = br.readLine();
					System.out.println("Enter your name>>");
					String name1 = br.readLine();;

					Tweet p = new Tweet(tweet, email,name1);
					// System.out.println(p);
					boolean answer2 = PostTweet.addTweetToDB(p);
					if (answer2) {
						System.out.println("Tweet added successfully");
						System.out.println("............................................................");
					} else {
						System.out.println("Tweet not added");
						System.out.println("............................................................");
					}

				} else if (num == 22) {
					// View My Tweets

					Tweet p = new Tweet();
					boolean answer2 = ViewMyTweets.getMyTweets(name);
					if (answer2) {
						System.out.println("Tweet retrived successfully");
						System.out.println("............................................................");
					} else {
						System.out.println("Tweet not added");
						System.out.println("............................................................");
					}
				}

				else if (num == 33) {
					// View All tweets

					boolean answer3 = ViewAllTweets.getAllTweets();
					if (answer3) {
						System.out.println("All Tweets retrived successfully");
						System.out.println("............................................................");
					} else {
						System.out.println("Tweet not retrived");
						System.out.println("............................................................");
					}

				}

				else if (num == 44) {
					// View All users
					boolean answer4 = ViewAllUsers.getAllUsers();
					if (answer4) {
						System.out.println("All Users retrived successfully");
						System.out.println("............................................................");
					} else {
						System.out.println("Users not retrived");
						System.out.println("............................................................");
					}

				} else if (no == 55) {
					Exit.exit();

				}
      
			}
		
      
			}
			 else {
					System.out.println("User not logined");
					System.out.println("............................................................");
				}

		}

		else if (no == 2) {

			// Login User

			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter your Email Id>>");
			String email = sc1.next();
			System.out.println("Enter your password>>");
			String password = sc1.next();

			User user = new User(email, password);
			// System.out.println(user);
			boolean answer = LoginUser.loginUser(user);
			if (answer) {
				System.out.println("User login successfully");
				System.out.println("............................................................");
			 
			
			while(true) {

			System.out.println("If you want to post tweet then press 11");
			System.out.println("View My tweets press 22");
			System.out.println("View All tweets press 33");
			System.out.println("View All Users press 44");
			//System.out.println("Exit>>> press 55");

			int num = sc.nextInt();
			System.out.println("............................................................");

			if (num == 11) {
				// Post Tweet
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("Enter your Tweet>>");
				String tweet = br.readLine();
				System.out.println("Enter your name>>");
				String name = br.readLine();

				Tweet p = new Tweet(tweet, email, name);
				// System.out.println(p);
				boolean answer1 = PostTweet.addTweetToDB(p);
				if (answer1) {
					System.out.println("Tweet added successfully");
					System.out.println("............................................................");
				} else {
					System.out.println("Tweet not added");
					System.out.println("............................................................");
				}

			} else if (num == 22) {
				// View My Tweets
				Scanner sc3 = new Scanner(System.in);
				System.out.println("Enter your name>>");
				String name = sc3.next();

				Tweet p = new Tweet();
				boolean answer1 = ViewMyTweets.getMyTweets(name);
				if (answer1) {
					System.out.println("Tweet retrived successfully");
					System.out.println("............................................................");
				} else {
					System.out.println("Tweet not added");
					System.out.println("............................................................");
				}
			}

			else if (num == 33) {
				// View All tweets

				boolean answer1 = ViewAllTweets.getAllTweets();
				if (answer1) {
					System.out.println("All Tweets retrived successfully");
					System.out.println("............................................................");
				} else {
					System.out.println("Tweet not retrived");
					System.out.println("............................................................");
				}

			}

			else if (num == 44) {
				// View All users
				boolean answer1 = ViewAllUsers.getAllUsers();
				if (answer1) {
					System.out.println("All Users retrived successfully");
					System.out.println("............................................................");
				} else {
					System.out.println("Users not retrived");
					System.out.println("............................................................");
				}

			}
			else if (no == 55) {
				Exit.exit();

			}
		}}else {
			System.out.println("User not logined");
			System.out.println("............................................................");
		}
		 }else if (no == 3) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter your Email Id>>");
			String email = sc1.next();
			System.out.println("Enter your password>>");
			String password = sc1.next();

			User user = new User(email, password);
			System.out.println(user);
			boolean answer = ForgetPassword.forgetPass(email,password);
			if (answer) {
				System.out.println("Forget Password sucessfully");
				System.out.println("............................................................");
			} else {
				System.out.println("Password nor forget");
				System.out.println("............................................................");
			}
			

		}

		else if (no == 4) {
			Exit.exit();

		}

	}

}
