package com.dopeysboy.problem3;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int highestCount = 0;
        
        for(int i = 0; i < s.length(); i++){
            int count = numNonRepeats(s, i);
            
            if(count > highestCount){
                highestCount = count;
            } else {
                continue;   
            }
        }
        
        return highestCount;
    }
    
    public int numNonRepeats(String s, int idx){
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = idx; i < s.length(); i++){
            String workingStr = s.substring(i, i+1);
            
            if(map.containsKey(workingStr)){
                return count;
            } else {
                map.put(workingStr, 1);
                count++;
            }
        }
        
        return count;
    }
}