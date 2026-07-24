import java.util.Scanner;

public class greetings {
    public static void main(String[] args) {
        System.out.println("Enter 1, 2 or 3 as your choice to see the magic!");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        /*
         * if (choice == 1) {
         * System.out.println("Hello!");
         * } else if (choice == 2) {
         * System.out.println("Nameste");
         * } else if (choice == 3) {
         * System.out.println("Bonjour");
         * } else {
         * System.out.println("Invalid chioce!");
         * }
         */

        switch (choice) {
            case 1:
                System.out.println("Hello!");
                break;
            case 2:
                System.out.println("Nameste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }
        sc.close();

    }
}
