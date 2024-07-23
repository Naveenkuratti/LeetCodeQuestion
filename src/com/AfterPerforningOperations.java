package com;

public class AfterPerforningOperations {
public static void main(String[] args) {
	AfterPerforningOperations s = new AfterPerforningOperations();
	String[] opertions= {"--X","X++","X++"};
	int result = s.finalvaluesOpertions(opertions);
	System.out.println("output"+result);
}
public int  finalvaluesOpertions(String[] opertions) {
	int x=0;
	for(int i=0; i<opertions.length; i++) {
		if(opertions[i].equals("X++") || opertions[i].equals("++X")) {
			 x++;
		} else if(opertions[i].equals("X--") || opertions[i].equals("--X")) {
		    x--;
		}
	}
	return x;
}
}
