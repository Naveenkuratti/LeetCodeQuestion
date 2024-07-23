package com;

import java.sql.Array;
import java.util.Arrays;

public class PlusOne {
	public static void main(String[] args) {
		PlusOne p=new PlusOne();
		int []digits= {1,2,3};
		System.out.println(Arrays.toString(p.plusOne(digits)));
	}
public int[] plusOne(int []digits) {
	int n =digits.length;
	for(int i=n-1;i>=0;i++) {
		if(digits[i]<9) {
			digits[i]++;
			return digits;
			
			
		}
		digits[i]=0;
		
	}
	int [] num=new int[n+1];
    num[0]=1;
    return num;
	
}
}
