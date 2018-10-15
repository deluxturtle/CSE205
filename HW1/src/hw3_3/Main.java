package hw3_3;
import java.util.ArrayList;

/*
 * @author: Andrew Seba
 */
public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(-1);
		list.add(3);
		list.add(-5);
		
		int negativeCount = 0;
		for(int i = 0; i < list.size(); i++) 
		{
			if(list.get(i) < 0) 
			{
				negativeCount += 1;
			}
		}
		System.out.print(negativeCount);
	}
}
