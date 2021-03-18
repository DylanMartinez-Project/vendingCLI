package com.techelevator;

import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/* Like all other Java code, unit testing code is defined within a class.
 * Each test class will typically contain all of the unit tests for a single
 * "unit" of production code.
 *
 * If the "unit" is a single class from the production code, then the
 * convention is that the test class will belong to the same package as the
 * class under test and the name of the test class is the name of the
 * production class with "Test" at the end.  For example, the test class
 * for the production class "Foo" would be "FooTest"
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LectureTest {

	/* If a method is annotated with @Before, it will be executed immediately prior to every test.
	 * It is intended to be used when there is a repetitive setup (i.e. "Arrange") task that is
	 * performed by several tests */
	@Before
	public void setup() {
		System.out.println("setup");
	}

	/* If a method is annotated with @After, it will be executed immediately after every test.
	 * It is intended to be used when there is a repetitive cleanup task that is performed by
	 * several tests (e.g. deleting temp files, rolling back database transactions, etc) */
	@After
	public void teardown() {
		System.out.println("teardown");
	}


	@Test
	public void length_returns_the_number_of_characters_in_a_String() {
		System.out.println("length_returns_the_number_of_characters_in_a_String"); // FOR DEMONSTRATION PURPOSES ONLY, don't do this in your own tests


	}

	@Test
	public void startsWith_returns_true_if_a_string_starts_with_the_specified_characters() {
		System.out.println("startsWith_returns_true_if_a_string_starts_with_the_specified_characters"); // FOR DEMONSTRATION PURPOSES ONLY, don't do this in your own tests

	}

	@Test
	public void this_test_fails_every_time() {

	}

}
