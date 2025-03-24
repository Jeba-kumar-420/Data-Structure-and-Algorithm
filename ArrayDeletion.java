class Node {
    int data;
    Node next;

   
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ArrayDeletion {
    Node head;

    
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    
    public void delete(int value) {
        if (head == null)
        	return; 
        
        if (head.data == value) {
            head = head.next; 
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == value) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Value " + value + " not found in the list.");
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ArrayDeletion list = new ArrayDeletion();

       
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Linked List before deletion:");
        list.print();

        
        list.delete(20);
        System.out.println("Linked List after deleting 20:");
        list.print();
    }
}