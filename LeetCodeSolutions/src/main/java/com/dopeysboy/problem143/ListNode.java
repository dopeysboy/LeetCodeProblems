package com.dopeysboy.problem143;

import java.util.Arrays;
import java.util.Objects;

class ListNode {
	int val;
	ListNode next;

	public ListNode() {}
	
	public ListNode(int x) {
		val = x;
		next = null;
	}
	
	public ListNode(int x, ListNode next) {
		val = x;
		this.next = next;
	}
	
	public ListNode(int[] values) {
		this.val = values[0];
		if(values.length > 1) {
			this.next = new ListNode(Arrays.copyOfRange(values, 1, values.length));
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(next, val);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListNode other = (ListNode) obj;
		return Objects.equals(next, other.next) && val == other.val;
	}
}