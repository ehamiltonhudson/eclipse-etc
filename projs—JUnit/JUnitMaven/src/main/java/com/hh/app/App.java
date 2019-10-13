package com.hh.app;

/* Hello world! */

public class App {
	
	
	private String appName;
	private int appRating;
	private boolean appSuccessful;
	
	// create new instance of app
	public App(String name, int rating, boolean successful) {
		appName = name;
		appRating = rating;
		appSuccessful = successful;
	}
	
	// initialize it with other params
	public String getAppName() {
		return appName;
	}
	
	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	public int getAppRating() {
		return appRating;
	}
	
	public void setAppRating(int appRating) {
		this.appRating = appRating;
	}
	
	public boolean getAppSuccess() {
		return appSuccessful;
	}
	
	public void setAppSuccessful(boolean appSuccessful) {
		this.appSuccessful = appSuccessful;
	}
	// return it in method

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
