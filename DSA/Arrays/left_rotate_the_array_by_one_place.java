package Arrays;

import java.util.Scanner;

public class left_rotate_the_array_by_one_place {
    public static void main(String[] args) {
        int arr[] = { 11, 4, 6, 7, 3, 7, 8 };
        // int first = arr[0];

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // for (int i = 0; i <=arr.length-1; i++) {
        // if (i <= (arr.length - 2)) {
        // arr[i] = arr[i + 1];
        // } else
        // arr[i] = first;
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // for number of rotations
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the number of rotations :");
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();

        for (int i = times; i >= 1; i--) {
            int first = arr[arr.length - (arr.length)];
            for (int j = 0; j <= arr.length - 1; j++) {
                if (j <= (arr.length - 2)) {
                    arr[j] = arr[j + 1];
                } else
                    arr[j] = first;
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
