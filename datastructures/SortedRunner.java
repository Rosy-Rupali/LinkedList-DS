package com.bridgelabz.datastructures;

public class SortedRunner {

	public static void main(String[] args) {
		SortedLinkedList<Integer> numberList = new SortedLinkedList<Integer>();
		numberList.add(56);
		numberList.add(30);
		numberList.add(40);
		numberList.add(70);
		numberList.add(34);
		System.out.println("Elements of the list are: ");
		numberList.show();

	}

}
