package com.dopeysboy.problem1;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] returnArr = new int[2];
        
        outer:
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){
                    returnArr[0] = i;
                    returnArr[1] = j;
                    
                    break outer;
                }
            }
        }
        
        return returnArr;
    }
}