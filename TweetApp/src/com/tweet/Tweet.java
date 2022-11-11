package com.tweet;

public class Tweet {
	private String postTweet;
	private String email;
	private String name;

	public Tweet(String postTweet, String email) {
		super();
		this.postTweet = postTweet;
		this.email = email;
	}

	public Tweet(String name) {
		super();

		this.name = name;
	}

	public Tweet(String postTweet, String email, String name) {
		super();
		this.postTweet = postTweet;
		this.email = email;
		this.name = name;
	}

	public String getPostTweet() {
		return postTweet;
	}

	public void setPostTweet(String postTweet) {
		this.postTweet = postTweet;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tweet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Post [postTweet=" + postTweet + ", email=" + email + "]";
	}

}
