package com.dopeysboy.problem1342;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTests {
	
	private Solution solution;
	private Integer expected;
	private Integer actual;
	private Integer input;
	
	@BeforeEach
	void setUp() throws Exception {
		solution = new Solution();
	}

	@AfterEach
	void tearDown() throws Exception {
		solution = null;
		expected = null;
		actual = null;
		input = null;
	}

	@Test
	void test_case_1() {
		input = 14;
		
		expected = 6;
		actual = solution.numberOfSteps(input);
		
		assertEquals(expected, actual);
	}

	@Test
	void test_case_2() {
		input = 8;
		
		expected = 4;
		actual = solution.numberOfSteps(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_case_3() {
		input = 123;
		
		expected = 12;
		actual = solution.numberOfSteps(input);
		
		assertEquals(expected, actual);
	}
}
