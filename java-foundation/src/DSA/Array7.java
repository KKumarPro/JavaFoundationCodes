//Array Deletion

package DSA;

public class Array7 {
    public static void main(String[] a){

        int[] arr1 = {1,2,3,4,5};
        int position = 2;

        int[] arr2 = new int[arr1.length - 1];

        for(int i=0, j=0; i<arr1.length; i++){
            if(i == position) continue;
            arr2[j++] = arr1[i];
        }

        for(int x : arr2){
            System.out.print(x + " ");
        }
    }
}