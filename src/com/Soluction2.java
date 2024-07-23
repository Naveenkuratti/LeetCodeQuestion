package com;

public class Soluction2 {
	
public static void main(String[] args) {

Soluction2 s = new Soluction2();
System.out.println(s.reverse(123456));






}
public int  reverse(int x) {
	int rev=0;
	while(x!=0) {
		int digit=x%10;
		if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE) {
			return 0;
		}
		rev = (rev*10)+digit;
	     x=x/10;
	     
	}
	return rev;
}
	
}
