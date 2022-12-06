package com.dopeysboy.problem13;
class Solution {
    public int romanToInt(String s) {
        //go through the s, for each char, will add up the total
        char[] romNum = s.toCharArray();
        int[] romValues = new int[romNum.length];
        int returnSum = 0;
        
        for(int i = 0; i < romNum.length; i++){
            romValues[i] = singleRomToInt(romNum[i]);
        }
        
        if(romValues.length == 1) {
        	return romValues[0];
        }
        for(int i = 0; i < romValues.length - 1; i ++){
        	if(i == romValues.length - 2) {
        		returnSum += romValues[i + 1];
        	}
        	if(romValues[i] < romValues[i + 1]){
                returnSum -= romValues[i];
            } else {
                returnSum += romValues[i];
            }
        }
        
        return returnSum;
    }
    
    private int singleRomToInt(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}