package com.dopeysboy.problem383;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTests {

	private Solution solution;
	private Boolean expected;
	private Boolean actual;
	private String ransomNote;
	private String magazine;
	
	@BeforeEach
	void setUp() throws Exception {
		solution = new Solution();
	}

	@AfterEach
	void tearDown() throws Exception {
		solution = null;
		expected = null;
		actual = null;
		ransomNote = null;
		magazine = null;
	}

	@Test
	void test_case_1() {
		ransomNote = "a";
		magazine = "b";
		
		expected = false;
		actual = solution.canConstruct(ransomNote, magazine);
		
		assertEquals(expected, actual);
	}

	@Test
	void test_case_2() {
		ransomNote = "aa";
		magazine = "ab";
		
		expected = false;
		actual = solution.canConstruct(ransomNote, magazine);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_case_3() {
		ransomNote = "aa";
		magazine = "aab";
		
		expected = true;
		actual = solution.canConstruct(ransomNote, magazine);
		
		assertEquals(expected, actual);
	}
}
