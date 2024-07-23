package com;

import java.util.HashSet;

public class LongestSubString {
public static void main(String[] args) {
	LongestSubString S = new LongestSubString();
	
	String str ="abcdab";
	System.out.println(longest(str));
	System.out.println(S);
	
	
}
public static  String  longest(String str) {
	HashSet<Character> set = new HashSet<Character>();
	String longestOverall="";
	String longestTillNow ="";
	for(int i=0; i<str.length(); i++) {
		char c =str.charAt(i);
		if(set.contains(c)) {
			longestTillNow ="";
			set.clear();
		}
		
		set.add(c);
		longestTillNow+=c;
		if(longestTillNow.length()>longestOverall.length()) {
			longestOverall=longestTillNow;
		}
	}
	return longestOverall;
	
}
}
