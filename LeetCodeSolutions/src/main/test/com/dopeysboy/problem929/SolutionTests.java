package com.dopeysboy.problem929;

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
		String[] input = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		
		expected = 2;
		actual = solution.numUniqueEmails(input);
		
		assertEquals(expected, actual);
	}

	@Test
	void test_case_2() {
		String[] input = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
		
		expected = 3;
		actual = solution.numUniqueEmails(input);
		
		assertEquals(expected, actual);
	}
}
