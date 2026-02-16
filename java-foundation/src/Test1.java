import java.util.Scanner;

public class Test1 {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements: ");
        int[] arr = new int[n];

        //Array entered by the user
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();

        //Reversing the array
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();

        //Sorting the array
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();

        //Searching the elements in the array

    }
}
