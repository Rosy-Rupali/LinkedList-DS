package com.bridgelabz.datastructures;

import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) {

		LinkedList<Integer> numberList = new LinkedList<Integer>();
		numberList.add(56);
		numberList.add(30);
		numberList.add(40);
		numberList.add(70);
		System.out.println("Linked list elements");
		numberList.show();
		System.out.println();
		int result = numberList.searchWithValue(40);
		numberList.remove(result);
		numberList.show();
		System.out.println("The size of the list is: "+numberList.size());

	}

}
