package com.bridgelabz.datastructures;

import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) {
		
		LinkedList<Integer> numberList = new LinkedList<Integer>();
		numberList.add(56);
		numberList.add(30);
		numberList.add(70);
		System.out.println("Linked list elements");
		numberList.show();
		System.out.println();
		int result = numberList.searchWithValue(30);
		String searchResult = (result == -1)? "value not found" : "value has been found at index: "+result;
		System.out.println(searchResult);
		

	}

}
