package com;

public class SearchInsertPostion {
	public static void main(String[] args) {
		 int nums[] = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
        
	}
	

public static int searchInsert(int[] nums, int target) {
	
	int left=0,rigth=nums.length-1;
	
	
	while(left<=rigth) {
		int mid =left+(rigth-left)/2;
		if(nums[mid]==target) {
			return mid;
		}else if(nums[mid] >target) {
			left=mid+1;
		}else {
			rigth=mid-1;
		}
		
	}
	return left;
}
}