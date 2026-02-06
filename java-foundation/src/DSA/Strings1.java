package DSA;
import java.util.Scanner;

public class Strings1 {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String name = sc.nextLine();
        System.out.println(name);

        String reverse = "";
        for(int i = name.length()-1; i >= 0; i--){
            reverse += name.charAt(i);
        }
        System.out.println(reverse);
    }
}
