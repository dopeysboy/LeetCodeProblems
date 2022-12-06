package com.dopeysboy.problem9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTests {
	
	private Solution solution;
	private Integer input;
	private Boolean expected;
	private Boolean actual;

	@BeforeEach
	void setUp() throws Exception {
		solution = new Solution();
	}

	@AfterEach
	void tearDown() throws Exception {
		solution = null;
		input = null;
		expected = null;
		actual = null;
	}

	@Test
	void test_case_1() {
		input = 121;
		
		expected = true;
		actual = solution.isPalindrome(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_case_2() {
		input = -121;
		
		expected = false;
		actual = solution.isPalindrome(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_case_3() {
		input = 10;
		
		expected = false;
		actual = solution.isPalindrome(input);
		
		assertEquals(expected, actual);
	}
}
