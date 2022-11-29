package com.dopeysboy.problem3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTests {
	
	private Solution solution;
	private String str;
	
	@BeforeEach
	void setUp() throws Exception {
		solution = new Solution();
	}

	@AfterEach
	void tearDown() throws Exception {
		solution = null;
		str = null;
	}

	@Test
	void test_case_one() {
		str = "abcabcbb";
		
		int expected = 3;
		int actual = solution.lengthOfLongestSubstring(str);
		
		assertEquals(expected, actual);
	}

	@Test
	void test_case_two() {
		str = "bbbbb";
		
		int expected = 1;
		int actual = solution.lengthOfLongestSubstring(str);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_case_three() {
		str = "pwwkew";
		
		int expected = 3;
		int actual = solution.lengthOfLongestSubstring(str);
		
		assertEquals(expected, actual);
	}
}
