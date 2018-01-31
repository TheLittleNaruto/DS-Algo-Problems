public class DoublyLinkedList {

	Node head;

	static class Node{
		
		int data;
		Node next, previous;
		
		public Node(int data){
			this.data = data;
			next = previous = null;
		}
	
	}
	
	public Node getNewNode(int x){
		return new Node(x);
	}
	
	public void insertAtHead(int x){
		Node newNode = getNewNode(x);
		if(head == null){
			head = newNode;
			return;
		}
		head.previous = newNode;
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAtTail(int x){
		Node newNode = getNewNode(x);
		Node temp = head;
		if(head == null){
			head = newNode;
			return;
		}
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.previous = temp;
	}
	
	public void print(){
		Node temp = head;
		System.out.print("Forward: ");
		while(temp != null){
			System.out.print(" " + temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void sortedInsert(int data) {
		Node newNode = getNewNode(data);
		Node temp = head;
    
		if(head == null || head.data >= data){
			insertAtHead(data);
		}
    
		boolean inserted = false;
		
		while(temp.next != null){
			if(temp.next.data >= data){
				newNode.next = temp.next;
				newNode.previous = temp;
				temp.next.previous = newNode;
				temp.next = newNode;
				inserted = true;
				break;
			}
			temp = temp.next;
		}
		if(!inserted && temp != null){
			newNode.previous = temp;
			temp.next = newNode;
		}
		
	}
	
	public void reversePrint(){
		Node temp = head;
		if(temp == null) return; // empty list, exit
		// Going to last Node
		while(temp.next != null) {
			temp = temp.next;
		}
		System.out.print("Reverse: ");
		while(temp != null) {
			System.out.print(" " + temp.data);
			temp = temp.previous;
		}
		System.out.print("\n");
	}
	
	public void reverse(){
		Node current = head;
		if(current == null) return; // empty list, exit
		// Going to last Node
		Node previous = null;
		Node next;
		while(current != null) {
			next = current.next;
			current.next = previous;
			current.previous = next;
			previous = current;
			current = next;
		}
		head = previous;
	}
	
	public static void main(String[] args){
		
		DoublyLinkedList DL = new DoublyLinkedList();
		DL.insertAtHead(6); DL.print(); DL.reversePrint();
		DL.insertAtHead(5); DL.print(); DL.reversePrint();
		DL.insertAtHead(2); DL.print(); DL.reversePrint();
		DL.sortedInsert(7); DL.print(); DL.reversePrint();
		DL.reverse(); DL.print(); DL.reversePrint();
		
	}
}