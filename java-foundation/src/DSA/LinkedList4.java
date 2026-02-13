package DSA;
import java.util.Scanner;

public class LinkedList4 {
    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        Node head = new Node(100);
        head.next = new Node(200);
        head.next.next = new Node(300);
        head.next.next.next = new Node(400);
        printList(head);

        System.out.println("\nEnter the value to insert: ");
        int value = sc.nextInt();
        System.out.println("Enter the position: ");
        int pos = sc.nextInt();

        Node n = new Node(value);
        if(pos == 0){
            n.next = head;
            head = n;
        }
        else {
            Node temp = head;
            for(int i = 0; i < pos-1 && temp.next != null; i++)
                temp = temp.next;
            n.next = temp.next;
            temp.next = n;
        }
        printList(head);
    }
}
