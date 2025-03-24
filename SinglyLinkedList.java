class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    // Insert at a specific position
    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Position must be a non-negative integer.");
            return;
        }
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currentNode = head;
        for (int i = 0; i < position - 1; i++) {
            if (currentNode == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    // Print the linked list
    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
}
