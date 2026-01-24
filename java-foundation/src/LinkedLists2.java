import java.util.LinkedList;

public class LinkedLists2 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5); list.add(6); list.add(7); list.add(8); list.add(9); list.add(10);
        System.out.println(list);
        list.addFirst(0);
        list.addLast(11);
        System.out.println(list);
        list.removeFirst(); list.removeLast();
        System.out.println(list);
        System.out.println(list.get(5));
    }
}