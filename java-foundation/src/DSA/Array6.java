package DSA;

class Array6 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int pos = 2;
        int val = 25;

        int[] arr2 = new int[arr1.length + 1];
        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (i == pos) {
                arr2[i] = val;
            } else {
                arr2[i] = arr1[j++];
            }
        }

        for (int x : arr2)
            System.out.print(x + " ");
    }
}