package com.dopeysboy.problem904;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTests {

	private Solution solution;
	private Integer expected;
	private Integer actual;
	
	@BeforeEach
	void setUp() throws Exception {
		solution = new Solution();
	}

	@AfterEach
	void tearDown() throws Exception {
		solution = null;
		actual = null;
		expected = null;
	}

	@Test
	void test_cast_1() {
		int[] input = {1,2,3,2,2};
		
		expected = 4;
		actual = solution.totalFruit(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_case_2() {
		int[] input = {1,2,1};
		
		expected = 3;
		actual = solution.totalFruit(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_case_3() {
		int[] input = {0,1,2,2};
		
		expected = 3;
		actual = solution.totalFruit(input);
		
		assertEquals(expected, actual);
	}

}
