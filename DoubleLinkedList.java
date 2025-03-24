
public class DoubleLinkedList {
	Node head;
	Node tail;
	
	class Node
	{
		int data;
		Node next;
		Node prev;
		
		Node(int val)
		{
			data=val;
			next=null;
			prev=null;
		}
	}
    public void DoubleLinkedList() {
	head=null;
    }
	public void insertAtBegin(int val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node temp=head;
			newNode.next=temp;
			head=newNode;
		}
	}
		public void display()
		{
		Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+"");
				temp=temp.next;
			}
		}
		public void displayUsingPrev()
		{
			Node temp=tail;
			while(temp!=null)
			{
				System.out.println(temp.data+" ");
				temp=temp.prev;
			}
		}
		public void insertAtAnyPos(int pos,int val) {
			Node newnode=new Node(val);
			Node temp=head;
			for(int i=1;i<pos-1;i++) {
				temp=temp.next;
			}
			newnode.next=temp.next;
			temp.next=newnode;
		}
		public void viewposition(int mypos) {
			Node temp=head;
			System.out.println("Head Value" +temp.data);
			for(int i=0;i<mypos-1;i++)
			{ temp=temp.next; }
			System.out.println("current position value"+temp.data);
			
		}
		public void deleteAtPosition(int delpos) {
			Node temp=head;
			Node dtemp=null;
			for(int i=0;i<delpos-1;i++) {
				dtemp=temp;
				temp=temp.next;
			}
			dtemp.next=temp.next;
		}
		public void deleteAtBegin() {
			head=head.next;
		}
		public void DoubleinsertBegin(int val) {
			Node newNode=new Node(val);
			if(head==null)
			{
				head=newNode;
				tail=newNode;
			}
			else {
				Node temp=head;
				newNode.next=temp;
				head=newNode;
				temp.prev=newNode;
			}
	
    }
}
