//To find the smallest and the largest word ass per the Dictionary from the word given by the user

package HackerRank;
import java.util.Scanner;

public class String3 {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any word: ");
        String s = sc.nextLine();

        System.out.print("Enter the number of words you want to select: ");
        int k = sc.nextInt();

        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        for(int i=1; i<=s.length()-k; i++){
            String current = s.substring(i, i+k);
            if(current.compareTo(smallest) < 0)
                smallest = current;
            if(current.compareTo(largest) > 0)
                largest = current;
        }
        System.out.println(smallest);
        System.out.println(largest);
        sc.close();
    }
}
