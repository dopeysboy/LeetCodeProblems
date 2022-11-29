package com.dopeysboy.problem2;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*
        go through l1 and get value, get l2 value at that same "spot"
        
        if l1.val + l2.val > 10
            returnLN.val = thatSum % 10 
            returnLN.next.val += 1
        */
        
        //l1 and l2 are the heads of those respective listnodes
        //head of the returnLN
        ListNode returnLN = new ListNode();
        ListNode currentL1 = l1;
        ListNode currentL2 = l2;
        ListNode currentRLN = returnLN;
              
        int sum = 0;
        while(currentL1 != null || currentL2 != null){
            int l1Value = 0;
            int l2Value = 0;   
            
            if(currentL1 != null){
                l1Value = currentL1.val;
            }
            
            if(currentL2 != null){
                l2Value = currentL2.val;
            }
            
            sum += l1Value + l2Value;
            
            if(sum > 9){
                currentRLN.val =  sum % 10;
                sum = 1;
            } else {
                currentRLN.val = sum;
                sum = 0;
            }
            
            if(currentL1 != null && currentL1.next != null){
                currentL1 = currentL1.next;
            } else {
                currentL1 = null;
            }
            
            if(currentL2 != null && currentL2.next != null){
                currentL2 = currentL2.next;
            } else {
                currentL2 = null;
            }
            
            if(currentL1 == null && currentL2 == null){
                if(sum != 0){
                    currentRLN.next = new ListNode(sum);
                }
            } else {
                currentRLN.next = new ListNode();
                currentRLN = currentRLN.next;
            }
        }
        return returnLN;
    }
}