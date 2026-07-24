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
        int result1 = n1.compareTo(n2);
        if(result1 < 0)
            System.out.println("No");
        else if (result1 > 0)
            System.out.println("Yes");
        else
            System.out.println("No");

        //Capitalize the first letter
        String combine = (n1+ " " +n2).trim();
        String result2 = "";
        String[] words = combine.split("\\s+");
        for(String word : words){
            if(word.length() > 0){
                String first = word.substring(0,1).toUpperCase();
                String rest = word.substring(1).toLowerCase();
                result2 = result2 + first + rest + " ";
            }
        }
        System.out.println(result2.trim());

        sc.close();
    }
}
