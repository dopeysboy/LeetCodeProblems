package com.dopeysboy.problem4;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Idx = 0;
        int nums2Idx = 0;
        
        int mergedArrLength = nums1.length + nums2.length;
        int[] mergedArr = new int[mergedArrLength];
        double median = 0;
        
        //combine two arrays,
        for(int i = 0; i < mergedArr.length; i++){
            int num1, num2;
            if(nums1Idx == nums1.length){
                num1 = Integer.MAX_VALUE;    
            } else {
                num1 = nums1[nums1Idx];
            }
            
            if(nums2Idx == nums2.length){
                num2 = Integer.MAX_VALUE;
            } else {
                num2 = nums2[nums2Idx];
            }
            
            if(num1 < num2){
                mergedArr[i] = num1;
                nums1Idx++; 
            } else {
                mergedArr[i] = num2;
                nums2Idx++;
            }
        }
        
        //get middle of mergedArr, if even number of elements, will take the two middle, add them then divide by two
        if(mergedArrLength % 2 == 0){
            median = mergedArr[mergedArrLength / 2] + mergedArr[mergedArrLength / 2 - 1];
            median /= 2;
        } else {
            median = mergedArr[mergedArrLength / 2];
        }
        
        return median;
    }
}