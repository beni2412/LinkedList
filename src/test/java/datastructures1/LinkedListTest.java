package datastructures1;

import org.junit.Test;

import org.junit.Assert;

public class LinkedListTest {
	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeAddedFromEnd() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		MyLinkedList list = new MyLinkedList();
		list.addEnd(firstNode);
		list.addEnd(secondNode);
		list.addEnd(thirdNode);
		list.print();
	}

	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeAddedFromFront() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		MyLinkedList list = new MyLinkedList();
		list.addFront(firstNode);
		list.addFront(secondNode);
		list.addFront(thirdNode);
		list.print();
	}
}