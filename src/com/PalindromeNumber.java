package com;

public class PalindromeNumber {
public static void main(String[] args) {
		PalindromeNumber p = new PalindromeNumber();
		int x = 121;
		System.out.println(p.ispandlire(x));
	
	
	
}
public boolean ispandlire(int x) {
	String numstr = Integer.toString(x);
	String reversedStr = new StringBuffer(numstr).reverse().toString();
return numstr.equals(reversedStr);
	
}
}
