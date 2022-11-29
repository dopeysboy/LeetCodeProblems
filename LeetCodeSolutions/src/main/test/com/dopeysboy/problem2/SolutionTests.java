package com.dopeysboy.problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTests {
	
	private Solution solution;
	private ListNode ln1;
	private ListNode ln2;
	private ListNode expected;
	private ListNode actual;
	
	@BeforeEach
	void setUp() throws Exception {
		solution = new Solution();
	}

	@AfterEach
	void tearDown() throws Exception {
		solution = null;
		ln1 = null;
		ln2 = null;
		expected = null;
		actual = null;
	}

	@Test
	void test_case_1() {
		/**
		 * ln1 = [2, 4, 3]
		 * ln2 = [5, 6, 4]
		 * expected = [7, 0, 8]
		 */
		
		ln1 = new ListNode(2, 
				new ListNode(4, 
					new ListNode(3)));
		
		ln2 = new ListNode(5,
				new ListNode(6,
					new ListNode(4)));
		
		expected = new ListNode(7,
					new ListNode(0, 
						new ListNode(8)));
		
		actual = solution.addTwoNumbers(ln1, ln2);
		
		assertEquals(expected, actual);
	}

	@Test
	void test_case_2() {
		/**
		 * ln1 = [0]
		 * ln2 = [0]
		 * expected = [0]
		 */
		ln1 = new ListNode(0);
		ln2 = new ListNode(0);
		
		expected = new ListNode(0);
		actual = solution.addTwoNumbers(ln1, ln2);
		
		assertEquals(ln1, ln2);
	}
	
	@Test
	void test_case_3() {
		/**
		 * ln1 = [9,9,9,9,9,9,9]
		 * ln2 = [9,9,9,9]
		 * expected = [8,9,9,9,0,0,0,1]
		 */
		ln1 = new ListNode(9,
				new ListNode(9,
					new ListNode(9,
						new ListNode(9,
							new ListNode(9,
								new ListNode(9,
										new ListNode(9)))))));
		ln2 = new ListNode(9,
				new ListNode(9,
					new ListNode(9,
						new ListNode(9))));
		
		expected = new ListNode(8,
					new ListNode(9,
						new ListNode(9,
							new ListNode(9,
								new ListNode(0,
									new ListNode(0,
										new ListNode(0,
											new ListNode(1))))))));
		
		actual = solution.addTwoNumbers(ln1, ln2);
		
		assertEquals(expected, actual);
	}
}
