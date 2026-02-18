package HackerRank;
import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();

        //counting the number of alphabets
        int count = n1.length() + n2.length();
        System.out.println(count);

        //alphabetically / lexicographically
        int result = n1.compareTo(n2);
        if(result < 0)
            System.out.println("No");
        else if (result > 0)
            System.out.println("Yes");
        else
            System.out.println("Equal");

        //Capitalize the first letter

        sc.close();
    }
}
