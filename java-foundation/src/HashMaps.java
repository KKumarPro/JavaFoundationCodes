import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] a){
        Map<Integer, String> register = new HashMap<>();
        register.put(1, "Karan");
        register.put(2, "Ram");
        register.put(3, "Shyam");

        System.out.println(register);
        System.out.println(register.get(1)+" "+register.get(2));

        for(int i : register.keySet())
            System.out.println("ID: "+i+"   "+"Name: "+register.get(i));

        register.remove(3);
        System.out.println(register);
        System.out.println(register.size());
        register.clear();
        System.out.println(register);
    }
}
