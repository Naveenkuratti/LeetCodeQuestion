package com;

import java.util.HashMap;

public class RomanToInterger {
	 public static int romanToInt(String s) {
		 HashMap<Character, Integer>set = new HashMap<Character, Integer>();
		set.put('I', 1);
		set.put('V', 5);
		set.put('X', 10);
		set.put('L', 50);
		set.put('C', 100);
		set.put('D', 500);
		set.put('M', 1000);
		
		int result=set.get(s.charAt(s.length()-1));
		for(int i=s.length()-2; i>=0; i--) {
			if(set.get(s.charAt(i)) <set.get(s.charAt(i+1))) {
				result=set.get(s.charAt(i));
			}
			else {
				result=set.get(s.charAt(i));
			}
		}
		return result;
		
		}
	 public static void main(String[] args) {
		 RomanToInterger n = new RomanToInterger();
		 



		String s="IVXLCDM";
		
		
		System.out.println(n.romanToInt(s));
	}
	

}
