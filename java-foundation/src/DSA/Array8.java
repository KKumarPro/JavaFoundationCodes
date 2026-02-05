package DSA;
import java.util.Scanner;

public class Array8 {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);

        //Taking input of number of elements in the array
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];

        //Taking input of the elements of the array
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < arr1.length; i++){
                arr1[i] = sc.nextInt();
        }

        //Printing the array
        System.out.print("Array: ");
        for (int i : arr1) {
            System.out.print(i+" ");
        }

        //Sorting the array
        System.out.print("\nSorted Array: ");
        for(int i = 0; i < arr1.length-1; i++){
            for(int j =0; j < arr1.length-i-1; j++){
                if(arr1[j] > arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }
        for (int i : arr1) {
            System.out.print(i + " ");
        }

        //Searching the elements of the array after sorting
        System.out.print("\nEnter the element to search: ");
        int key = sc.nextInt();
        int index = -1;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] == key){
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}