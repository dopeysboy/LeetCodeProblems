package com.dopeysboy.problem35;
class Solution {
   public int searchInsert(int[] nums, int target) {
		/**
		 * check middle of array if target, return array pos else go lower or higher and
		 * check middle of subarray
		 */

		if(nums.length >= 2) {
			return searchSubArray(nums, target, 0, nums.length - 1);
		} else {
			return target > nums[0]
					? 1
					: 0;
		}
	}

	public int searchSubArray(int[] nums, int target, int start, int end) {
		/*
		 * when end is 3 and start is 0 middle should be 1 (because even number)
		 * 
		 * then start should be middle (1) end 3 middle should be 2
		 */
		if (nums[start] == target) {
			return start;
		} else if (nums[end] == target) {
			return end;
		}

		int diff = end - start;

		int middle = start + (diff / 2);
		
		if(diff == 1) {
			return target < nums[start]
					? start
					: target > nums[end]
						? (end + 1)
						: end;
		} else if (nums[middle] > target) {
			return searchSubArray(nums, target, start, middle);
		} else if (nums[middle] < target) {
			return searchSubArray(nums, target, middle, end);
		} else {
			return middle;
		}
	}
}