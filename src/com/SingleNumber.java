package com;

public class SingleNumber {
	
	  public static int  singleNumber(int nums[]) {
		int sing=nums[0];
		for(int i=1;i<nums.length;i++) {
			sing=sing^nums[i];
	}
		return sing;
		
	}
	  public static void main(String[] args) {
		int nums[]= {2,2,3};
		System.out.println(singleNumber(nums));
		  
	}
}