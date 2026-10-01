package linkedlist;

public class doublylinkedlist {
	
	class node{
		int data;
		node next;
		node prev;
		
		public node(int data) {
			this.data=data;
			this.next= null;
			this.prev=null;
		}
	}
	
	node head=null;
	node tail=null;
	
	void add(int data) {
		node obj=new node(data);
		
		if(head==null) {
			head=obj;
			tail=obj;
		}
		
		else {
			obj.prev=tail;
			tail.next=obj;
			tail=obj;
			tail.next=null;	
		}
	}
	
	void display() {
		if(head==null) {
			System.out.println("Linked list is Empty");
			return;
		}
		
		System.out.println("Nodes Doubly Linked List : ");
		for(node current=head;current!=null;current=current.next) {
			System.out.print("'"+ current.data + "'" + " " );
		}
	}
	
	public static void main(String[]args) {
		
		doublylinkedlist list=new doublylinkedlist();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.display();
	}
}