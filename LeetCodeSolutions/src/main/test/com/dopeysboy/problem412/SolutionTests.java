package com.dopeysboy.problem412;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTests {
	
	private Solution solution;
	private Integer input;
	private List<String> expected;
	private List<String> actual;
	
	@BeforeEach
	void setUp() throws Exception {
		solution = new Solution();
		expected = new ArrayList<>();
	}

	@AfterEach
	void tearDown() throws Exception {
		solution = null;
		input = null;
		expected = null;
		actual = null;
	}

	@Test
	void test_case_1() {
		input = 3;
		
		String[] expectedArr = {"1","2","Fizz"};
		
		for(String str : expectedArr) {
			expected.add(str);
		}
		
		actual = solution.fizzBuzz(input);
		
		assertEquals(expected, actual);
	}

	@Test
	void test_case_2() {
		input = 5;
		
		String[] expectedArr = {"1","2","Fizz","4","Buzz"};
		
		for(String str : expectedArr) {
			expected.add(str);
		}
		
		actual = solution.fizzBuzz(input);
		
		assertEquals(expected, actual);
	}

	@Test
	void test_case_3() {
		input = 15;
		
		String[] expectedArr = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};
		
		for(String str : expectedArr) {
			expected.add(str);
		}
		
		actual = solution.fizzBuzz(input);
		
		assertEquals(expected, actual);
	}
}
