import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        System.out.println("Enter any two numbers to compare:");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Y:");
        int num2 = sc.nextInt();

        sc.close();

        if (num1 > num2) {
            System.out.println("X is greater than Y");
        } else if (num1 == num2) {
            System.out.println("X and Y are equal");
        } else {
            System.out.println("Y is greater than X");
        }
    }
}
