import java.util.ArrayList;

public class ArraysList2 {
    public static void main(String[] a){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.remove(0);
        list.add(1,200);
        System.out.println(list);
    }
}
