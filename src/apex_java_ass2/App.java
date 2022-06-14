package apex_java_ass2;

public class App {
	public static void main(String[] args) {
		int[] listData = { 1, 2, 2, 3, 3, 9 };
		Node head = new Node(listData[0]);
		for (int count = 1; count < listData.length; count++)
			RemoveDuplicates.insert(head, listData[count]);

		System.out.printf("Linked list is : ");
		RemoveDuplicates.print(head);

		RemoveDuplicates.removeDuplicates(head);
		System.out.printf("Linked list after removing duplicates : ");
		RemoveDuplicates.print(head);
	}
}
