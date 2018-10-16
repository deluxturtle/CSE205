package hw1_3_5;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) 
	{
		
	}
	
	/*
	 * Creates an ArrayList with the length of 'pLen' and fills all values with
	 * the 'pInitValue'.
	 */
	public static ArrayList<Integer> arrayListCreate(int pLen, int pInitValue)
	{
		ArrayList<Integer> newList = new ArrayList<>();
		
		for(int i = 0; i < pLen; i++)
		{
			newList.add(pInitValue);
		}
		
		return newList;
	}
}
