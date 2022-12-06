package com.dopeysboy.problem13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTests {
	
	private Solution solution;
	private Integer expected;
	private Integer actual;
	private String input;
	
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
		input = "III";
		
		expected = 3;
		actual = solution.romanToInt(input);
		
		assertEquals(expected, actual);
	}

	@Test
	void test_case_2() {
		input = "LVIII";
		
		expected = 58;
		actual = solution.romanToInt(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_case_3() {
		input = "MCMXCIV";
		
		expected = 1994;
		actual = solution.romanToInt(input);
		
		assertEquals(expected, actual);
	}
}
