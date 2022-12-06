package com.dopeysboy.problem904;
class Solution {
    public int totalFruit(int[] fruits) {
        /*
            helper function to determine how many fruit you can pick when 
            starting from an index
            iterate through array and return largest number
        */
        int maxTrees = 0;
        
        for(int i = 0; i < fruits.length; i++){
            int numTrees;
            
            if(i == 0){
                numTrees = numTrees(fruits, i);
            } else if(fruits[i] == fruits[i - 1]){
                continue;
            } else {
                numTrees = numTrees(fruits, i);
            }
            
            if(numTrees > maxTrees){
                maxTrees = numTrees;
            }
        }
        
        return maxTrees;
    }
    
    public int numTrees(int[] fruits, int start){
        int firstTree = -1;
        int secondTree = -1;
        int numTrees = 0;
        
        for(int i = start; i < fruits.length; i++){
            if(fruits[i] == firstTree){
                numTrees++;
            } else if(fruits[i] == secondTree){
                numTrees++;
            } else if(firstTree == -1){
                firstTree = fruits[i];
                numTrees++;
            } else if(secondTree == -1){
                secondTree = fruits[i];
                numTrees++;
            } else {
                break;
            }   
        }
        
        return numTrees;
    }
}