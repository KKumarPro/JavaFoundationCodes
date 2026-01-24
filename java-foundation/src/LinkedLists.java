import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] a){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100); list.add(200); list.add(300);
        System.out.println(list);
        list.addFirst(50); list.addLast(400);
        System.out.println(list);
        list.remove(0); list.remove(2);
        System.out.println(list);
    }
}
