package hw3_2;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(0);
		for(int i = 1; i < 10; ++i) {
			list.set(i,  list.get(i) + list.get(i-1));
		}
		System.out.println(list);
	}
}
