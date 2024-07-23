package com;

import java.security.PublicKey;
import java.util.Scanner;

public class PalindromeString {
public static void main(String[] args) {
	String reverse="";
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the String");
	String original = sc .nextLine();

	for(int i=original.length()-1; i>=0; i--) {
		reverse = reverse+original.charAt(i);
	}
	if(original.equals(reverse)) {
		System.out.println("given String is palindrome");
	}else {
		System.out.println("given String is not palindrome");
	}
}
} 