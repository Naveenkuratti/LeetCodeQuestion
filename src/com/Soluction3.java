package com;

public class Soluction3 {
public static void main(String[] args) {
	int nums[]= {0,1,2,2,3,0,4,2};
	int val=2;
	
	int newlength=removeElemts(nums, val);
	for(int i=0;i<newlength; i++) {
		System.out.println(nums[i]+" ");	
	}

	
}
public static int removeElemts(int [] nums,int val) {
	int count=0;
	for(int i=0; i<nums.length;i++) {
		if(nums[i]!=val) {
			nums[count]=nums[i];
			count++;
		}
	}
	return count;
	
}
}
