package practice;

import java.util.LinkedList;

public class LinkedListNode {

	public static void main(String[] args) {
		 LinkedList l1 = new LinkedList();
		 l1.insert(0,2);
		 l1.insert(0,1);
		 System.out.println(11.find(1));
		 
		 l1.insert(0,0);
		 System.out.println(11);
		 
		 l1.insert(1,5);
		 System.out.println(11);
		 
		 l1.insert(2);
		 System.out.println(11);
		 
		 
	}
	
	private Node head;
	public LinkedList() {
		head = null;
	}
	
	public int find(int n) {
		return n;
	}
	public void insert(int pos, int val) {
			
	}
	public void delete(int pos) {
		
	}
	public String toString() {
		return toString;
	}
			
	

}
