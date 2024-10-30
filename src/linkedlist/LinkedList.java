package linkedlist;

public class LinkedList {
	private class Node{
		int data;
		Node next;
		
	}
	
	private Node head;
	private Node tail;
	private int size=0;
	
	
	
//	add node at first 
	public void addFirst(int val) {
		Node nn= new Node();
		nn.data=val;
		if(size==0) {
			head=nn;
			tail=nn;
		}else {
			nn.next=head;
			head=nn;
		}
		size++;
		
	}
	//add last
	public void addLast(int val) {
		Node nn=new Node();
		nn.data=val;
		if(size==0) {
			head=nn;
				
		}else {
			tail.next=nn;
		}
		tail=nn;
		size++;
	}
//	get the 1st element
	public void getFirst() {
		Node temp=head;
		if(size==0) {
			System.out.println("Empty Linked List");
		}else {
			System.out.print("FIrst Val: >"+temp.data);
		}
	}
	//get the the last element
	public void getLast() {
		Node temp=tail;
		if(size==0) {
			System.out.println("NO element in the Linked List");
		}else {
			System.out.println("last element: "+temp.data);
		}
	}
	
//	get the element at index 
	public void getAtIndex(int index) {
		
		if(index>size-1) System.out.println("Not Enough Element");
		if(index<0) System.out.println("iNvalid Index");
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	//add at given index
	
	public void addAtIndex(int val,int index) {
		Node nn=new Node();
		nn.data=val;
		
		//get the index 
//		is this index exist
//		find the size
		int sz=0;
		Node temp=head;
		Node dummyTail=head;
		while(temp!=null) {
			dummyTail=temp;
			temp=temp.next;
			sz++;
		}
		if(sz==0) {
//			add the node and this will be 1st
			head=nn;
			tail=nn;
			
		}else if(index<size){
//			find the perfect point for adding the node 
			Node dummy=head;
			
			for(int i=0;i<index-1;i++) {
				dummy=dummy.next;
			}
//			System.out.println("Debug index : "+index+"value :"+dummy.data);
//			add at first
			nn.next=dummy.next;
			dummy.next=nn;
		}else {
//			add at last
			dummyTail.next=nn;
			tail=nn;
		}
		
	}
	
//remove the first Node
	
	public void removeFirst() {
		
		int sz=0;
		
		if(head==null) {
			head=null;
			tail=null;
		}
			head=head.next;
		
		if(head==null) {
			tail=null;
		}
	}
	
//remove the last Node
	public void removeLast() {
		Node prev=head;
		if(head==null || head.next==null) {
			head=null;
			tail=null;
		}else {
			Node curr=head.next;
			
			while(curr.next!=null) {
				curr=curr.next;
				prev=prev.next;
				
			}
//		prev wil be the last Node linked
			prev.next=null;
			tail=prev;
		}
		
		
	}
//	remove at any index
	public void removeAtIndex(int index) {
	    if (head == null) {
	        // List is empty, nothing to remove
	        return;
	    }
	    
	    // If removing the first element
	    if (index == 0) {
	        head = head.next;
	        if (head == null) {
	            // List had only one element, so update tail
	            tail = null;
	        }
	        return;
	    }
	    
	    // Traverse to the node just before the specified index
	    Node temp = head;
	    int i = 0;
	    while (temp.next != null && i < index - 1) {
	        temp = temp.next;
	        i++;
	    }

	    // Check if index is within bounds
	    if (temp.next == null) {
	        // Index is out of bounds (greater than the size of the list)
	        return;
	    }

	    // Remove the node at the index
	    temp.next = temp.next.next;
	    
	    // If the removed node was the last node, update tail
	    if (temp.next == null) {
	        tail = temp;
	    }
	}
//reverse LinKed List
	public void reverseLinkedList() {
		Node prev=null;
		Node curr=head;
		
		while(curr!=null) {
			Node ahead=curr.next;
			curr.next=prev;
			prev=curr;
			curr=ahead;
		}
//		lastly swap the position
		tail=head;
		head=prev;
		
	}
	
// mid in the linked list
	public void mid() {
		Node s=head;
		Node f=head;
		while(f.next!=null  && f.next.next!=null) {
			s=s.next;
			f=f.next.next;
		}
		System.out.println(s.data);
	}
	
//	display the linkedlist
	public void display() {
		Node temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}

}
