//Use of Array list (Collections)

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList {
    public static void main(String[] a){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        System.out.println("Before: "+list);

        list.remove(2);
        System.out.println("After: "+list);
    }
}
