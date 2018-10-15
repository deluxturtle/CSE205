package hw1_3_1;
import java.util.ArrayList;

/*
 * Fills array list with numbers 0-4 twice
 * @author: Andrew Seba
 */
public class Main {
	public static void main(String[] args) {
	
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
		System.out.println(list);
	}
	
}
