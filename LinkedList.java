public class LinkedList {
    
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public LinkedList() {
        head = null;
    }

    public void insertAtBegin(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head; 
            head = newNode;      
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " "); 
            temp = temp.next;
        }
        System.out.println(); 
    }
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertAtBegin(10);
        l.insertAtBegin(20);
        l.insertAtBegin(30);
        
        System.out.println("Linked List:");
        l.display(); 
    }
}