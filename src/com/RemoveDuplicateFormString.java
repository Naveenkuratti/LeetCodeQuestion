package com;

import java.util.HashSet;

public class RemoveDuplicateFormString {
public static void main(String[] args) {
String str ="Java";

System.out.println(removeDuplicates(str));


}
public  static String removeDuplicates(String str) {
	HashSet<Character> set = new HashSet<Character>();
	StringBuffer sf = new StringBuffer();
	for(int i=0; i<str.length(); i++) {
		Character c = str.charAt(i);
		if(!set.contains(c)) {
			set.add(c);
			sf.append(c);
		}
	
	}
	return sf.toString();
}
}