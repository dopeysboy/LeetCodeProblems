package com.dopeysboy.problem412;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            String addToAnswer = "";
            if(i % 3 == 0){
                addToAnswer += "Fizz";
            }
            if(i % 5 == 0){
                addToAnswer += "Buzz";
            }
            if(addToAnswer.equals("")){
                addToAnswer += i;
            }
            answer.add(addToAnswer);
        }
        
        return answer;
    }
}