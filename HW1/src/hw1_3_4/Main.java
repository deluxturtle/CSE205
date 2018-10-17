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
		Hw1_34 hw = new Hw1_34();
		System.out.println(hw.arrayListSum(list));
	}
}
