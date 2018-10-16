package hw1_3_7;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(1);
		numbers.add(2);
		numbers.add(5);
		numbers.add(2);
		numbers.add(5);
		numbers.add(2);
		numbers.add(5);
		numbers.add(2);
		numbers.add(5);
		System.out.println(numbers);
		arrayListRemove(numbers, 5);
		System.out.println(numbers);
	}
	
	public static void arrayListRemove(ArrayList<Integer> pList, int pValue)
	{
		for(int i = 0; i < pList.size(); i++)
		{
			if(pList.get(i) == pValue)
			{
				pList.remove(i);
				i--;
			}
		}
	}
}
