import java.util.ArrayList;
import java.util.List;

public class ArraysList3 {
    public static void main (String[] a){
        List<Integer> list = new ArrayList<>();
        list.add(20); list.add(20); list.add(20); list.add(50); list.add(50);
        System.out.println(list);
        list.add(1, 100);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
