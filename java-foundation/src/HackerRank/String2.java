package HackerRank;
import java.util.Scanner;

public class String2 {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String result = n1.substring(start,end);
        System.out.println(result);
        sc.close();
    }
}