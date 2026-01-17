import java.util.Scanner;

public class Adult {
    public static void main(String[] args) {
        System.out.println("Enter your Age: ");
        Scanner sc = new Scanner(System.in);

        float age = sc.nextInt();
        System.out.println("Your age is: " + age);
        sc.close();

        if (age >= 18) {
            System.out.println("You are an adult, you can vote!");
        } else {
            System.out.println("You are not a adult, you can't vote!");
        }
    }
}
