package practice;

public class Node {
	public static void main(String[] args) {
		 Node x = new Node(1,null);
		 Node y = new Node(2, x);
		 System.out.println(x.getData());// 1
		 System.out.println(y.getData());//2
		 System.out.println(y.getNext());//hashcode 
		 System.out.println(y.getNext().getData());//1
		 
	}
	private int data;
	private Node next;
	
	public Node(int d, Node nx) {
		data= d;
		next=nx;	
	}
	
	public int getData() {
		return data;
	}
	public Node getNext() {
		return next;
	}
	public void setData(int d) {
		data=d;
	}
	public void setNext(Node nx) {
		next=nx;
	}

}
