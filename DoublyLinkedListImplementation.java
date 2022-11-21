package Day20Nov2022DoublyLinkedList;

public class DoublyLinkedListImplementation {

	Node prev, head, tail;
	int length = 0;

	// Insert - It will add one by one node
	public void insert(int input) {
		if (head == null) {
			Node temp = new Node(input);
			head = temp;
			tail = temp;
		} else {
			Node temp = head;

			while (temp.next != null) { // if temp.next != null its incremented by 1 or it will create a new node
				temp = temp.next;
			}

			Node a = new Node(input);
			a.prev = temp;
			temp.next = a;
		}
		length++;
	}

	// Remove only first node in the linked list
	public void removeFirstNode() {
		Node temp = head;
		if (temp.next != null) {
			/*
			 * Remove first node there is two condition head.next.prev = null
			 * 
			 */
			temp.next.prev = null;
		}
		temp = temp.next;
		head = temp;
		tail = temp;

		length--;
	}

	/**
	 * Remove All Method iterate until each node check if temp.next not equal to
	 * null then current node of next and next node of previous assign as null
	 * Increment node by 1 temp = temp.next By default the last node of next always
	 * as "Null" Increment node by 1 temp = temp.next head as temp and tail as temp
	 *
	 */
	public void removeAll() {
		Node temp = head;

		while (temp.next != null) {
			temp.next.prev = null;
			temp = temp.next;
		}

		if (temp.next == null) {
			temp = temp.next;
		}

		head = temp;
		tail = temp;

		length--;
	}

	public void addAll(int result) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		if (temp.next == null) {
			Node a = new Node(result);
			a.prev = temp;
			temp.next = a;
			temp = temp.next;
		}
		length++;

	}

	public int size() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public boolean print() {
		if (head == null)
			return true;
		else {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.value);
				temp = temp.next;
			}
			System.out.println();
		}

		return false;
	}

}
