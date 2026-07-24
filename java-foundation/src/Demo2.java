//Class: A class is a blueprint, that defines the property and behavior of objects,
// that tells how the objects of the class work.


import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println("You entered: " + num);

        if (num % 2 == 0) {
            System.out.println("This is an even number");
        } else {
            System.out.println("This is a odd number");
        }
    }
}
