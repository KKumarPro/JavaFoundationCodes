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

        //Vowels and Consonants count
        int v = 0, c = 0;
        for(int i = 0; i < name.length(); i++){
            char ch = name.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                v++;
            else
                c++;
        }
        System.out.println("Vowels: "+v+" ");
        System.out.println("Consonants: "+c+" ");

        //Check Frequency
        int[] freq = new int[256];
        for (int i = 0; i < name.length(); i++) {
            freq[name.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                System.out.println((char)i + " : " + freq[i]);
        }
    }
}
