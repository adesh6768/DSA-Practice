package linkedlist;

public class singlylinklist {
	
	class node{ // creating new data type
		int data;
		node next;
		
		public node(int data) { // constructor
			this.data=data;
			this.next=null;
		}
	}
	
	//creating head and tail in singly linked list
	node head=null;
	node tail=null;
	
	//crate a function to add the data 
	void add(int data) {
		node newnode=new node(data);// create a new node
		//check list is empty or not
		if(head==null) {
			//if list is empty, both head and tail will point a new node
			head=newnode;
			tail=newnode;
		}
		
		else {
			//new node will be added after tail such that tail's next will point 
			tail.next=newnode;
			//new node will become new tail of the list
			tail=newnode;
		}
	}
	
	void display() {
		//node current will point head
		
		node current=head;
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		
		System.out.println("Nodes of singly linked list : ");
		
		while(current!=null) {
			//print each node by incrementing pointer
			System.out.print(current.data+",");
			current=current.next;
		}
		
		System.out.println();
	}

	public static void main(String[]args) {
		
		singlylinklist list=new singlylinklist();
		
		//add nodes to the list
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		//displays the nodes present in nodes
		
		list.display();
	}
	
}	