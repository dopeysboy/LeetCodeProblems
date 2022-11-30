package com.dopeysboy.problem4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTests {
	
	private Solution solution;
	private Double expected;
	private Double actual;
	
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
		int[] nums1 = {1, 3};
		int[] nums2 = {2};
		
		expected = 2.0;
		actual = solution.findMedianSortedArrays(nums1, nums2);
		
		assertEquals(expected, actual);
	}

	@Test
	void test_case_2() {
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		
		expected = 2.5;
		actual = solution.findMedianSortedArrays(nums1, nums2);
		
		assertEquals(expected, actual);
	}
}
