package DSA;
import java.util.Scanner;

public class Strings1 {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());

        //Reverse a string
        String reverse = "";
        for(int i = name.length()-1; i >= 0; i--){
            reverse += name.charAt(i);
        }
        System.out.println(reverse);

        //To Check Palindrome
        for(int i = name.length()-1; i >= 0; i--){
            reverse += name.charAt(i);
        }
        if (name.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
