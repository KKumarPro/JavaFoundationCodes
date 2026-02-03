package DSA;

import java.util.Arrays;

public class Array5 {
    public static void main(String[] a){
        int[] arr = {7,2,9,6,3,1,8,4,5};

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i + " ");
        }

        //Method 2 for experienced developers
        int[] arr2 = {4,5,3,1,2};
        Arrays.sort(arr2);
        for(int i : arr2){
            System.out.println(i+" ");
        }
    }
}
