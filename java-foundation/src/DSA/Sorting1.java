package DSA;
import java.util.Scanner;

public class Sorting1 {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array: ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        //Bubble Sort
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("\nBubble-Sort array : ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        //Selection Sort
        for(int i = 0; i < arr.length-1; i++) {
            int index = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.print("\nSelection-Sort array: ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        //Insertion Sort
        for(int i = 0; i < arr.length; i++){
            int current = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        System.out.print("\nInsertion-Sort array: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}