package DSA;

public class Array3 {
    public static void main(String[] a){
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int even = 0;
        int odd = 0;
        for(int i : arr){
            if (arr[i]%2 == 0){
                even++;
            }
            else
                odd++;
        }
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);
    }
}
