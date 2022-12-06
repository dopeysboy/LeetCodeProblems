package com.dopeysboy.problem1672;
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        
        for(int i = 0; i < accounts.length; i++){
            int accountWealth = countArr(accounts[i]);
           
            if(accountWealth > maxWealth){
                maxWealth = accountWealth;
            }
        }
        
        return maxWealth;
    }
    
    public int countArr(int[] account){
        int sum = 0;
        for(int i : account){
            sum += i;
        }
        return sum;
    }
}