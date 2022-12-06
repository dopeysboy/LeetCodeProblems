package com.dopeysboy.problem14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTests {
	private Solution solution;
	private String expected;
	private String actual;
	
	@BeforeEach
	void setUp() throws Exception {
		solution = new Solution();
	}

	@AfterEach
	void tearDown() throws Exception {
		solution = null;
		expected = null;
		actual = null;
	}

	@Test
	void test_case_1() {
		String[] input = {"flower", "flow", "flight"};
		
		expected = "fl";
		actual = solution.longestCommonPrefix(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_case_2() {
		String[] input = {"dog", "racecar", "car"};
		
		expected = "";
		actual = solution.longestCommonPrefix(input);
		
		assertEquals(expected, actual);
	}
}
