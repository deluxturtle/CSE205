package hw1_3_6;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) 
	{
		ArrayList<String> listOfNames = new ArrayList<>();
		listOfNames.add("Chris");
		
		
		insertName(listOfNames, "Ben");
		insertName(listOfNames, "Andrew");
		insertName(listOfNames, "Gilbert");
		insertName(listOfNames, "Zule");
		insertName(listOfNames, "Bob");
		insertName(listOfNames, "Kyle");
		
		
		for(String name : listOfNames) 
		{
			System.out.println(name);
		}
	}
	
	private static void insertName(ArrayList<String> pList, String pName) 
	{
		boolean inserted = false;
		for(int i = 0; i < pList.size(); i++)
		{
			String tempName = pList.get(i);
	
			if(pName.compareTo(tempName) < 0 )
			{
				//If the index isn't the beginning add it before the word.
				if(i > 1) 
				{
					pList.add(i - 1, pName);					
				}
				else 
				{
					pList.add(i, pName);
				}
				inserted = true;
				break;
			}
		}
		
		//Add the name to the end if it never was added.
		if(!inserted)
			pList.add(pName);
		
	}
	

}
