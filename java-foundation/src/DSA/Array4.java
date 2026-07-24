package DSA;

public class Array4 {
    public static void main(String[] a){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
