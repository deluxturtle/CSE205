package hw1_3_4;
import java.util.ArrayList;

/*
 * Function counts the total entries in the arrayList and returns the integer.
 * @author: Andrew Seba
 */
public class Main {
	
	
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		System.out.println(arrayListSum(list));
	}
	
	private static int arrayListSum(ArrayList<Integer> pList) 
	{
		int count = 0;
		for(int i = 0; i < pList.size(); i++) {
			count++;
		}
		return count;
	}
}
