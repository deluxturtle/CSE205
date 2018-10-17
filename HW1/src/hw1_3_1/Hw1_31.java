package hw1_3_1;

// CLASS: Hw1_31
// AUTHOR: Andrew Seba, aseba, aseba@asu.edu
import java.util.ArrayList;
public class Hw1_31 {
	
	public Hw1_31() {}
	
	// Creates an ArrayList that gets populated with numbers from 0 to 'limit'.
	// It does this per 'k' times.
	public ArrayList<Integer> ex3_1()
	{
		ArrayList<Integer> list = new ArrayList<>();
		int k = 2;
		int limit = 5;
		for(int i = 0; i < k; i++ )
		{
			for(int j = 0; j < limit; j++) 
			{
				list.add(j);
			}
		}
		return list;
	}
}
