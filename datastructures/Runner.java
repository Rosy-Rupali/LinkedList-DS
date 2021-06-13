package com.bridgelabz.datastructures;

import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) {
		
		LinkedList<Integer> numberList = new LinkedList<Integer>();
		numberList.add(56);
		numberList.add(70);
		numberList.addAtIndex(1, 30);
		numberList.show();


	}

}
