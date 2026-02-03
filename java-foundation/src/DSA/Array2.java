package DSA;

public class Array2 {
    public static void main(String[] a){
        int[] arr = {76,23,87,4,97,34};
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if(i < min){
                min = i;
            }
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }
}
