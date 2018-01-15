class LinkedList {
	
	Node head;
	
	public static class Node {
		
		int data;
		Node next;
		
		public Node(int d){
			data = d;
			next = null;
		}
		
	}
	
	//push new element at head
	public void push(int newValue){
		Node newNode = new Node(newValue);
		newNode.next = head;
		head = newNode;
	}
	
	//delete node which has first occurance of key 
	public boolean pop(int key){
		if(head != null){
			if(head.data == key){
				head = head.next;
				return true;
			}else{
				Node temp = head.next;
				Node previous = head;
				
				while(temp != null){
					if(temp.data == key){
						previous.next = temp.next;
						return true;
					}
					previous = temp;
					temp = temp.next;
				}
				return false;
			}
		} else{
			System.out.println("There is no item to delete.");
			return false;
		}
	}
	
	public boolean popByPosition(int position){
		int current = 0;
		boolean ret = false;
		if(head != null){
			if(position == 0){
				head = head.next;
				ret = true;
			}
			Node previous = null;
			Node start  = head;
		
			while(start != null){
				
				if(current == position){
					previous.next = start.next;
					return true;
				}
				
				previous  = start;
				start = start.next;
				current++;
			}
			
			if(previous == null){
				System.out.println("Unexpected index has been accessed for deletion.");
				ret = false;
			}else{
				ret = true;
				System.out.println("Node has been removed at specified position: " + position);
			}
		}
		return ret;
	}
	
	public boolean search(int key){
		if(head != null){
			if(head.data == key){
				return true;
			}else{
				Node start = head;
				Node previous = start;
				
				while(previous.next != null){
					if(previous.next.data == key){
						return true;
					}
					previous = previous.next;
				}
				
			}
		} 
		
		System.out.println("There is no item found.");
		return false;
	}
	
	public int length(){
		int length = 0;
		
		if(head == null){
			length = 0;
		}else{
			Node start = head;
			length = increaseSizeOnFoundNextNode(start, length);
		}
		return length;
	}
	
	private int increaseSizeOnFoundNextNode(Node current, int length){
	
		//iterative way
		/*while(current != null){
			length++;
			current = current.next;
		}*/
		//recursive way
		if(current != null){
			length++;
			return increaseSizeOnFoundNextNode(current.next, length);
		}
		
		return length;
	}
	
	public void reverse(){
		Node current = head;
		Node next = null;
		Node previous = null;
		
		while(current != null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}	
	
	public void printLinkedList(){
		printLinkedList(head);
	}
	
	public void printLinkedList(Node head){
		Node next = head;
		System.out.print(head.data + " ==> Node ");
		while(next.next != null){
			next = next.next;
			System.out.print(next.data + " ==> Node ");
		}
		
		System.out.print("\n");
	}
	
	public Node insertAtTail(Node head, int data) {

		Node ret = head;
		if(head == null){
			return new Node(data);
		}
		// loop until we find the end of the list
		while ((head.next != null)) {
           head = head.next;
		}

		// set the new node to the Object x, next will be null.
		head.next = new Node(data);
		return ret;
	}
	
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		
		Node head = new Node(5);
		head.next = new Node(3);
		head.next.next = new Node(0);
		head.next.next.next = new Node(1);
		
		ll.head = head;
		
		
		System.out.println("Printing linkedlist values.");
		
		ll.printLinkedList();
		
		System.out.println("Size of linkedlist is: " + ll.length());
		
		System.out.println("\nNow push a value");
		
		ll.push(12);
		
		System.out.println("Is 3 present: " + ll.search(3));
		
		System.out.println("Printing linkedlist values.");
		
		ll.printLinkedList();
		
		System.out.println("Size of linkedlist is: " + ll.length());
		
		
		System.out.println("\nNow remove a value");
		
		ll.pop(12);
		
		System.out.println("Printing linkedlist values.");
		
		ll.printLinkedList();
		
		System.out.println("Size of linkedlist is: " + ll.length());
		
		System.out.println("\nNow remove a value");
		
		ll.pop(1);
		
		System.out.println("Printing linkedlist values.");
		
		ll.printLinkedList();
		
		System.out.println("\nNow remove a value");
		
		ll.pop(31);
		
		System.out.println("Printing linkedlist values.");
		
		ll.printLinkedList();
		
		System.out.println("\nNow remove a value");
		
		ll.popByPosition(3);
		
		System.out.println("Printing linkedlist values.");
		
		ll.printLinkedList();
		
		System.out.println("Reversing linkedlist...");
		
		ll.reverse();
		
		System.out.println("Printing linkedlist values.");
		
		ll.printLinkedList();
		
		head = ll.insertAtTail(head, 65);
		
		ll.printLinkedList(head);
		
		
		
	}
	
}