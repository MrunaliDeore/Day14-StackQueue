package StackQueue;

import java.util.Scanner;

public class enqueue {

	static Node head;
	public void enqueue(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node pointer = head;

			while (pointer.next != null) {
				pointer = pointer.next;
			}

			pointer.next = newNode;
		}
	}

	public void printQueue(){
		if (head == null) {
			System.out.println("Queue is empty.\n");
		} else {
			Node pointer = head;
			while (pointer != null) {
				System.out.print(pointer.data + " ");
				pointer = pointer.next;
			}

		}
	}
	
	public static class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	public static void main(String[] args) {	        
		System.out.println("\nNew Queue Created:");
		enqueue queue = new enqueue();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.printQueue();
	}

}
}