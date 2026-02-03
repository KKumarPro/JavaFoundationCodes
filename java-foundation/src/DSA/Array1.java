package DSA;

public class Array1 {
    public static void main(String[] a){
        int[] arr = {1,3,9,23,7};
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println(sum);
    }
}
