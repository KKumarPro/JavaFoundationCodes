//An array is fix-sized container that stores elements of the same type.

import java.util.Scanner;

public class ArraysClass {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1. Create an array of size 3
            int[] numbers = new int[3];

            System.out.println("Please enter 3 integers:");

            // 2. Insert elements using a loop
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter value for index " + (i+1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            // 3. Print the array to verify
            System.out.println("\nArray contents:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Index " + (i+1) + ": " + numbers[i]);
            }

            scanner.close();
        }
    }