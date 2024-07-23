package com;

import java.util.HashMap;

public class Solution {
	   public int romanToInt(String s) {
	        HashMap<Character, Integer> set = new HashMap<Character, Integer>();
	        set.put('I', 1);
	        set.put('V', 5);
	        set.put('X', 10);
	        set.put('L', 50);
	        set.put('C', 100);
	        set.put('D', 500);
	        set.put('M', 1000);

	        int result = 0;
	        for (int i = 0; i < s.length(); i++) {
	            if (i > 0 && set.get(s.charAt(i)) > set.get(s.charAt(i - 1))) {
	                result += set.get(s.charAt(i)) - 2 * set.get(s.charAt(i - 1));
	            } else {
	                result += set.get(s.charAt(i));
	            }
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        Solution sol = new Solution();
	        String roman = "MCMXCIV";
	        System.out.println(sol.romanToInt(roman)); // Should print 1994
	    }
	}


