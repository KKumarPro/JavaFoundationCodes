package DSA;

public class LinkedList1 {
    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    public static void main(String[] a){
        Node head = new Node(10);
        Node sec = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);

        head.next = sec;
        sec.next = third;
        third.next = forth;

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
