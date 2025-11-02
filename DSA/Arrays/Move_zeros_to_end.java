package Arrays;

public class Move_zeros_to_end {
    public static void main(String[] args) {
        int arr[] = { 2, 0, 0, 0, 4, 5, 0, 0, 3, 4, 0, 6, 4 };

        // way-1

        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != pos) {
                    int temp = arr[i];
                    arr[i] = arr[pos];
                    arr[pos] = temp;
                }
                pos++;

            }
        }

        // way-2

        // we can use the another array to store the non-zero numbers and then add at
        // starting in original array and then zeros.

        // way-3

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == 0) {
        // // for (int j = i; j < arr.length; j++) {
        // // if (arr[j] != 0) {
        // // arr[i] = arr[j];
        // // arr[j] = 0;
        // // break;
        // // }
        // // }
        // //
        // int j = i;
        // while (j < arr.length) {
        // if (arr[j] != 0) {
        // arr[i] = arr[j];
        // arr[j] = 0;
        // break;

        // }
        // j++;
        // }
        // System.out.println(arr[i]);
        // // 2
        // }

        // // worst time complexity = O(n^2)
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
