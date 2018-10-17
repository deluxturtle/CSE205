package hw1_3_4;

import java.util.ArrayList;

// CLASS: Hw1_34
// AUTHOR: Andrew Seba, aseba, aseba@asu.edu
public class Hw1_34 {
	
	public Hw1_34() {}
	
	//Returns the count of entries in the list parameter.
	public int arrayListSum(ArrayList<Integer> pList) 
	{
		int count = 0;
		for(int i = 0; i < pList.size(); i++) {
			count++;
		}
		return count;
	}
}
