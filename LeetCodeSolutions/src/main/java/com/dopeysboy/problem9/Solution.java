package com.dopeysboy.problem9;
class Solution {
    public boolean isPalindrome(int x) {
        String intStr = String.valueOf(x);
        String revIntStr = "";

        for(int i = 0; i < intStr.length(); i++){
            String c = intStr.substring(i, i + 1);
            revIntStr = c + revIntStr;
        }

        return revIntStr.equals(intStr);
    }
}