package com.dopeysboy.problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTests {

	private Solution solution;

	@BeforeEach
	void setUp() throws Exception {
		solution = new Solution();
	}

	@AfterEach
	void tearDown() throws Exception {
		solution = null;
	}

	@Test
	void test_case_one() {
		int[] nums = {2,7,11,15};
		int target = 9;
		
		int[] expected = {0, 1};
		int[] actual = solution.twoSum(nums, target);
		
		assertEquals(expected[0], actual[0]);
		assertEquals(expected[1], actual[1]);
	}

	@Test
	void test_case_two() {
		int[] nums = {3, 2, 4};
		int target = 6;
		
		int[] expected = {1, 2};
		int[] actual = solution.twoSum(nums, target);
		
		assertEquals(expected[0], actual[0]);
		assertEquals(expected[1], actual[1]);
	}
	
	@Test
	void test_case_three() {
		int[] nums = {3, 3};
		int target = 6;
		
		int[] expected = {0, 1};
		int[] actual = solution.twoSum(nums, target);
		
		assertEquals(expected[0], actual[0]);
		assertEquals(expected[1], actual[1]);
	}
}
