package com.hh.app;

import com.hh.app.App;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/* Unit test for simple App. */
public class AppTest {
	private App newApp;

	/* basic test */
	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}
	
	@Before
	public void setUp() throws Exception {
//		newApp = new App();
	}

	@After
	public void tearDown() throws Exception {
		newApp = null;
	}

	@Test
	public void testNameExists() {
		String newAppName = "Ham's app";
		newApp.setAppName(newAppName);
	}
	
	@Test
	public void testRatingExists() {
		int newAppRating = 10;
		newApp.setAppRating(newAppRating);
	}
	
	@Test
	public void TestSuccessfulExists() {
		boolean newAppSuccessful = true;
		newApp.setAppSuccessful(newAppSuccessful);
		
	}
}
