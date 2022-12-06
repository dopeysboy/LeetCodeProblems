package com.dopeysboy.problem35;

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
		int[] nums = {1, 3, 5, 6};
		int target = 5;
		
		expected = 2;
		actual = solution.searchInsert(nums, target);
		
		assertEquals(expected, actual);
	}

	@Test
	void test_case_2() {
		int[] nums = {1, 3, 5, 6};
		int target = 2;
		
		expected = 1;
		actual = solution.searchInsert(nums, target);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_case_3() {
		int[] nums = {1, 3, 5, 6};
		int target = 7;
		
		expected = 4;
		actual = solution.searchInsert(nums, target);
		
		assertEquals(expected, actual);
	}
}
