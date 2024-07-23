package com;


public class Soluction {
	public static void main(String[] args) {
    Soluction s = new Soluction();
    int x=121;
    System.out.println(s.ispanlidorme(x));
	}
	public boolean ispanlidorme(int x) {
		//convert the number to sytring
		String numstr=Integer.toString(x);
		//get reverse the string
		String reversestr= new StringBuilder(numstr).reverse().toString();
		return numstr.equals(reversestr);
	}

}
