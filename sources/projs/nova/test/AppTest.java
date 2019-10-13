package projs.nova.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import projs.nova.main.App;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;


/* Unit test for simple App. */
public class AppTest {
	private App newApp;

	/* basic test */
	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}
	
	@BeforeEach
	public void setUp() throws Exception {
//		newApp = new App();
	}

	@AfterEach
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

/*
@BeforeEach
	void setUp() throws Exception {
}

@AfterEach
	void tearDown() throws Exception {
}

@Test
void test() {
	fail("Not yet implemented");
}
*/

