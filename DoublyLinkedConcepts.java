package Day20Nov2022DoublyLinkedList;

import org.junit.Test;

public class DoublyLinkedConcepts {
	
	
	@Test
	public void td1() {
		
		DoublyLinkedListImplementation dl = new DoublyLinkedListImplementation();
		
		dl.insert(10);
		dl.insert(20);
		dl.insert(30);
		dl.insert(40);
		
		
		DoublyLinkedListImplementation d2 = new DoublyLinkedListImplementation();
		d2.insert(50);
		d2.insert(60);
		d2.insert(70);
		
		System.out.println("########################################");
		dl.print();
		System.out.println("########################################");
		d2.print();
		System.out.println("########################################");
		
		//dl.addAll(d2);
		
		System.out.println("########################################");
		
		//dl.print();
		
		
		
		
		dl.print();
		
		
		
		
		
		
		
		
		
		
		//dl.removeFirstNode();
		/*
		 * dl.print();
		 * 
		 * System.out.println("****************************************");
		 * 
		 * dl.removeAll();
		 * 
		 * dl.print();
		 */
	}

}
