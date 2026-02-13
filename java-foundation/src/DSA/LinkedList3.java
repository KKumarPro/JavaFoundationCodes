package DSA;
import java.util.Scanner;

public class LinkedList3 {
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] a) {
        Node head = new Node(100);
        head.next = new Node(200);
        head.next.next = new Node(300);
        head.next.next.next = new Node(400);
        printList(head);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position to delete: ");
        int pos = sc.nextInt();
        if (pos == 0)
            head = head.next;
        else {
            Node temp = head;
            for (int i = 0; i < pos - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            if (temp.next != null)
                temp.next = temp.next.next;
            else
                System.out.println("Invalid Input!");
        }
        printList(head);
    }
}