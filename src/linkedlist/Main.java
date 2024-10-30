package linkedlist;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Hi bhaskar");
		LinkedList ll=new LinkedList();
		
		ll.addFirst(50);
		ll.addFirst(40);
		ll.addFirst(30);
		ll.addFirst(20);
		ll.addFirst(10);
		ll.addLast(-10);
		ll.addLast(-20);
		ll.addLast(-30);
		ll.addLast(-30);

		
		ll.getFirst();
		System.out.println();
		ll.getLast();
		ll.getAtIndex(0);
		
		ll.display();

		ll.addAtIndex(10, 6);
		ll.display();
		ll.removeFirst();
		ll.display();
		ll.removeLast();
		ll.removeLast();
		ll.display();
//		ll.removeAtIndex(5);
		ll.reverseLinkedList();
		ll.mid();
		ll.display();

	}
	
}
