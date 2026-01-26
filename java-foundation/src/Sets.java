//Example of Set --> HashSet

import java.util.*;
public class Sets {
    public static void main(String[] a){
        Set<Integer> s = new HashSet<>();
        s.add(11); s.add(45); s.add(11); s.add(45); s.add(40);
        System.out.println(s);

        Set<Integer> s2 = new LinkedHashSet<>();
        s2.add(11); s2.add(45); s2.add(11); s2.add(45); s2.add(40);
        System.out.println(s2);

        Set<Integer> s3 = new TreeSet<>();
        s3.add(11); s3.add(45); s3.add(11); s3.add(45); s3.add(40);
        System.out.println(s3);
    }
}
