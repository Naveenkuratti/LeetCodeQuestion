package com;

import java.util.Scanner;

public class NumberOfOccurrencesOfCharacterInString {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("enter the String");
	String str = sc.nextLine();
	int intinallenth =str.length();
	Scanner sc1 = new Scanner(System.in);
	System.out.println("enter the Character to find the occurencw");
	String str1 =sc1.next();
	
	str=str.replace(str1," ");
	int finallength=str.length();
	System.out.println("Total Number of occurences of character"+str1+(intinallenth-finallength));
}
}
