package com.dopeysboy.problem143;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTests {
	private Solution solution;
	private ListNode head;
	private ListNode expected;
	private ListNode actual;
	
	@BeforeEach
	void setUp() throws Exception {
		solution = new Solution();
	}

	@AfterEach
	void tearDown() throws Exception {
		solution = null;
		head = null;
		expected = null;
		actual = null;
	}

	@Test
	void test_case_1() {
		//[3,2,0,-4]
		//expected listnode of value 2
		int[] input = {3, 2, 0, -4};
		head = new ListNode(input);
		
		expected = head.next;
		//last node's return point
		head.next.next.next.next = expected;
		
		actual = solution.detectCycle(head);
		
		assertEquals(expected, actual);
	}

	@Test
	void test_case_2() {
		//[1,2]
		//expected head
		int[] input = {1, 2};
		head = new ListNode(input);
		
		expected = head;
		//last nodes return point
		head.next.next = expected;
		
		actual = solution.detectCycle(head);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_case_3() {
		//[1]
		//expected null
		
		head = new ListNode(1);
		expected = null;
		
		actual = solution.detectCycle(head);
		
		assertEquals(expected, actual);
	}
}
