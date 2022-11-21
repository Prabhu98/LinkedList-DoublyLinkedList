package Day20Nov2022DoublyLinkedList;

public class Node {

	
	
	int[] val;
	
	int value;

	Node next;
	Node prev;

	public Node(int[] result) {
		this.val = result;
		this.next =null;
		this.prev =null;
		
	}

	
	public Node(int input) {
		this.value = input;
		this.next =null;
		this.prev =null;
		
	}
	
	
	
}
