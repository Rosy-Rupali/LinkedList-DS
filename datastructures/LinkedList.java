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
	 * 
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

	/**
	 * Inserts the element at the starting of the linked list
	 * 
	 * @param data
	 */
	public void addAtStart(T data) {
		Node<T> newNode = new Node<>();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}

	/**
	 * Current node should not be null and it is pointing to the next should be null
	 */
	public void show() {
		Node<T> node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

}
