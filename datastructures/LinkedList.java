/************************************************************
 * Purpose Implementation Of Linked List
 * @author Rosy Rupali
 * @Version 1.0
 * @since 12-06-2021
 *
 ************************************************************/
package com.bridgelabz.datastructures;

public class LinkedList<T> {

	Node<T> head;

	/**
	 * add elements to the linked list
	 * @param data
	 */
	public void add(T data) {
		Node<T> newNode = new Node<>();
		newNode.data = data;
		if (head == null) {
			head = newNode;
		} else {
			Node<T> node = head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = newNode;
		}
	}
}
