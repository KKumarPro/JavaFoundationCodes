package DSA;

class LinkedList1 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at given position
    static Node insertAtPosition(Node head, int data, int pos) {

        Node newNode = new Node(data);

        // insert at beginning
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) return head; // invalid position

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    // Delete from given position
    static Node deleteAtPosition(Node head, int pos) {

        // delete from beginning
        if (pos == 0 && head != null) {
            return head.next;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) return head; // invalid position

        temp.next = temp.next.next;

        return head;
    }

    // Print list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // initial list: 10 -> 20 -> 30
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        printList(head);

        // insert 25 at position 2
        head = insertAtPosition(head, 25, 2);
        printList(head);

        // delete element at position 1
        head = deleteAtPosition(head, 1);
        printList(head);
    }
}
