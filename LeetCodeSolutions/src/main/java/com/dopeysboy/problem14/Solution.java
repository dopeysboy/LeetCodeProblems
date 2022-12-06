package com.dopeysboy.problem14;

class Solution {
	public String longestCommonPrefix(String[] strs) {
		String prefix = "";
		String testStr = strs[0];
		if (strs.length == 1) {
			prefix = testStr;
		} else {
			Outer: for (int j = 1; j <= testStr.length(); j++) {
				String tempPrefix = testStr.substring(0, j);

				for (int i = 1; i < strs.length; i++) {
					if (i == strs.length - 1) {
						if (!strs[i].startsWith(tempPrefix)) {
							break Outer;
						} else {
							prefix = tempPrefix;
						}
					} else {
						if (!strs[i].startsWith(tempPrefix)) {
							break Outer;
						}
					}
				}
			}
		}
		return prefix;
	}
}
