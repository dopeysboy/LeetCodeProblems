package com.dopeysboy.problem383;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        for(int i = 0; i < ransomNote.length(); i++){
            String ransomChar = ransomNote.substring(i, i + 1);
            if(magazine.contains(ransomChar)){
                magazine = magazine.replaceFirst(ransomChar, "");
            } else {
                return false;   
            }
        }
        
        return true;
    }
}