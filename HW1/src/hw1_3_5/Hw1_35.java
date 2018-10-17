package hw1_3_5;

import java.util.ArrayList;

// CLASS: 
// AUTHOR: Andrew Seba, aseba, aseba@asu.edu
public class Hw1_35 {
	
	public Hw1_35() {}
	
	// Creates an ArrayList with the length of 'pLen' and fills all values with
	// the 'pInitValue'.
	public ArrayList<Integer> arrayListCreate(int pLen, int pInitValue)
	{
		ArrayList<Integer> newList = new ArrayList<>();
		
		for(int i = 0; i < pLen; i++)
		{
			newList.add(pInitValue);
		}
		
		return newList;
	}
}
