package com.bridgelabz.datastructures;

import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) {
		
		LinkedList<Integer> numberList = new LinkedList<Integer>();
		numberList.add(56);
		numberList.add(30);
		numberList.add(70);
		System.out.println("Linked list before using pop method");
		numberList.show();
		System.out.println();
		numberList.pop();
		System.out.println("Linked List after using pop method");
		numberList.show();

	}

}
