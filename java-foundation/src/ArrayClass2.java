import java.util.Arrays;
public class ArrayClass2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int indexToRemove = 2; // Removing 30
        int currentSize = 5;

        System.out.println("Before: " + Arrays.toString(arr));

        // Shift elements to the left
        for (int i = indexToRemove; i < currentSize - 1; i++) {
            arr[i] = arr[i + 1];
        }
        // Optional: Set the last element to 0
        arr[currentSize - 1] = 0;
        System.out.println("After:  " + Arrays.toString(arr));
    }
}