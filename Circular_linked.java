public class Circular_linked {
    Node last; 

    class Node {
        int data;
        Node next = null;
        
        Node(int val) {
            data = val;
        }
    }

    Circular_linked() {
        last = null;
    }

    public void insertAtBegin(int val) {
        Node newnode = new Node(val);

        if (last == null) {
            last = newnode;
            last.next = last; 
        } else {
            newnode.next = last.next;
            last.next = newnode;
        }
    }

    public void display() {
        if (last == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);

        System.out.println(); 
    }

    public static void main(String[] args) {
        Circular_linked list = new Circular_linked();

        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);

        list.display(); 
    }
}







