package com.dopeysboy.problem1672;

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
		expected = null;
		actual = null;
	}

	@Test
	void test_case_1() {
		int[][] input = 
			{
					{1, 2, 3},
					{3, 2, 1}
			};	
		
		expected = 6;
		actual = solution.maximumWealth(input);
		
		assertEquals(expected, actual);
	}

	@Test
	void test_case_2() {
		int[][] input =
			{
					{1, 5},
					{7, 3},
					{3, 5}
			};
		
		expected = 10;
		actual = solution.maximumWealth(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_case_3() {
		int[][] input =
			{
					{2, 8, 7},
					{7, 1, 3},
					{1, 9, 5}
			};
		
		expected = 17;
		actual = solution.maximumWealth(input);
		
		assertEquals(expected, actual);
	}
}
