package com.dopeysboy.problem143;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return head;
        }
        
        Set<ListNode> set = new HashSet<>();
        ListNode currentNode = head;

        while(currentNode.next != null){
             if(!set.add(currentNode)){
                 return currentNode;
             } else {
                 currentNode = currentNode.next;
             }
        }

        return null;
    }
}