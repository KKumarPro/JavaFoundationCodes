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
    }
}
