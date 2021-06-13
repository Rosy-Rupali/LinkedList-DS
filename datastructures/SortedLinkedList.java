package com.bridgelabz.datastructures;

public class SortedLinkedList<T extends Comparable<T>> {
	Node<T> head;

	public void add(T data) {
		Node<T> newNode = new Node<>();
		newNode.data = data;
		if (head == null) {
			head = newNode;
		} else {
			if (data.compareTo(head.data) < 0) {
				newNode.next = head;
				head = newNode;
				return;
			}
			Node<T> node = head;
			Node<T> secondLastNode = head;
			if (node != null) {
				while ((node.next != null) || (node.data != null)) {
					if (data.compareTo(node.data) <= 0) {
						secondLastNode.next = newNode;
						newNode.next = node;
						break;
					}
					secondLastNode = node;
					node = node.next;
					if (node == null) {
						break;
					}
				}
			}

			secondLastNode.next = newNode;
		}
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
