package com;

public class ProgramToPrintElementsInEvenPostion {
public static void main(String[] args) {
	int arr[] = new int [] {1,2,3,4,5,6,7,8};
	for(int i=2; i<arr.length;i=i+2) {
		System.out.println("index="+i);
		System.out.println("value="+arr[i]);
	}
	
}
}
