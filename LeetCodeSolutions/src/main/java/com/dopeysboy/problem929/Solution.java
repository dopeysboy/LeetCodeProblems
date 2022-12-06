package com.dopeysboy.problem929;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numUniqueEmails(String[] emails) {
        //each email contains localName@domainName
        //localName+extraStuff@domainName will sendTo localname@domainName
        //loc.alName@domainName will sendTo localName@domainName
        
        /*
            split on @ sign
            if domainName == otherDomainName && otherLocalName == strippedLocalName
                continue
            else
                sumUniqueEmails += 1
        */
        String[] cleanedEmails = emails;
        Map<String, Integer> wordCount = new HashMap<>();
        
        for(int i = 0; i < cleanedEmails.length; i++){
            cleanedEmails[i] = cleanEmail(cleanedEmails[i]);
        }
        
        for(String email : cleanedEmails){
            if(wordCount.containsKey(email)){
                int count = wordCount.get(email);
                count++;
                wordCount.put(email, count);
            } else {
                wordCount.put(email, 1);
            }
        }
        
        return wordCount.size();
    }
    
    public String cleanEmail(String email){
        String localName = email.substring(0, email.indexOf("@"));
        String domainName = email.substring(email.indexOf("@"));
        
        String stripped = localName.replace(".", "");
       
        if(stripped.contains("+")){
            int plusIdx = stripped.indexOf("+");
            stripped = stripped.substring(0, plusIdx);
        }
        
        return stripped + domainName;
    }
}