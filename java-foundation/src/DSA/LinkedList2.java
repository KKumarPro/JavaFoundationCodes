package DSA;

public class LinkedList2 {
    static class Node{
        int data;
        int position;
        Node next;

        Node(int d, int pos){
            this.data = d;
            this.next = null;
            this.position = pos;
        }
    }
    public static void main(String[] a){
        Node head = new Node(10, 0);
        head.next = new Node(20,1);
        head.next.next = new Node(30,2);

        Node n = new Node(100,0);
        n.next = head;
        head = n;

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }
}
