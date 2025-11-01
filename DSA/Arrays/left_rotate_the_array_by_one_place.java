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

        // for (int i = 0; i <= arr.length - 2; i++) {

        // arr[i] = arr[i + 1];

        // }
        // arr[arr.length - 1] = first;

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        /*
         * ✅ Time Complexity
         * 
         * Key operations:
         * 
         * First for loop – prints all elements
         * Runs n times → O(n)
         * 
         * Second for loop – shifts elements left by one position
         * Runs n-1 times → O(n)
         * 
         * Third for loop – prints array again
         * Runs n times → O(n)
         * 
         * Add them:
         * 
         * O(n)+O(n)+O(n)=O(3n)
         * 
         * Constant factors are ignored, so:
         * 
         * 👉 Time Complexity = O(n)
         * 
         * ~~~~~~~~~~~~~~~~~~~~~Example~~~~~~~~~~~~~~~~~~~~~
         * 
         * Imagine you need to fill n bottles with water manually.
         * 
         * Case 1 — You fill fast:
         * You take 3 seconds per bottle
         * Total time = 3n seconds → O(n)
         * 
         * Case 2 — Your friend fills slower:
         * He takes 10 seconds per bottle
         * Total time = 10n seconds → O(n)
         * 
         * 📊 Compare
         * Bottles (n) Your Time (3n) Friend Time (10n)
         * 10 30 sec 100 sec
         * 100 300 sec 1000 sec
         * 1000 3000 sec 10000 sec
         * 
         * Even though your friend is slower (constant difference),
         * both increase linearly as bottles increase.
         * 
         * So both are O(n).
         * 
         * ✅ Key Point
         * 
         * We care only about pattern of growth:
         * 
         * Bottles double Time doubles → Linear O(n)
         * 
         * The constant (3 or 10 seconds) doesn't change that pattern.
         * 
         * 🧠 Simple formula
         * 3n → O(n)
         * 10n → O(n)
         * 100n → O(n)
         * 
         * 
         * All are linear, so constants are ignored.
         * 
         * 🎤 Final Simplest Explanation
         * 
         * When input doubles, time doubles → O(n).
         * Whether each item takes 2 sec or 10 sec doesn’t change the Big-O — we ignore
         * those fixed numbers.
         * 
         * 
         * ✅ Space Complexity
         * 
         * Uses only a single extra variable (first)
         * No new array created
         * Memory used does not grow with input size
         * 👉 Space Complexity = O(1) (constant space)
         * 
         * 
         * ✅ 1. Total Space
         * 
         * Total space = memory used by your entire program
         * (including input array + extra variables)
         * 
         * In your code:
         * 
         * Array size = n elements
         * Extra variable first
         * So total space taken:
         * Total Space=O(n)(because array size is n)
         * 
         * ✅ 2. Extra Space (Auxiliary Space)
         * 
         * Extra space = memory used in addition to the input
         * You only created:
         * 
         * int first;
         * 
         * That is constant memory → does NOT grow with n.
         * 
         * So:
         * Extra Space=O(1)
         * 📌 Summary Table
         * Type Meaning Space in your program
         * Total Space Input + extra O(n)
         * Extra Space (Auxiliary Space) Only additional memory used O(1)
         * 
         * ~~~~~~~~~~~~~~~~~~~~~Example~~~~~~~~~~~~~~~~~~~~~
         * 
         * If you have 5 bottles and you keep one extra cup:
         * Total items: 6 ⇒ O(n)
         * Extra cup: 1 ⇒ O(1)
         * Same idea here.
         * 
         * 🎯 Final Answer
         * 
         * Total Space = O(n)
         * Extra Space (Auxiliary Space) = O(1)
         */

        // for number of rotations
        // int arr1[] = { 11, 4, 6, 7, 3, 7, 8 };

        // for (int i = 0; i < arr1.length; i++) {
        // System.out.print(arr1[i] + " ");
        // }
        // System.out.println();
        // System.out.print("Enter the number of rotations :");
        // Scanner sc = new Scanner(System.in);
        // int times = sc.nextInt();
        // if (times >= 7) {
        // times = times % 7;
        // System.out.println(times);
        // }

        // for (int i = times; i >= 1; i--) {
        // int temp = arr1[arr1.length - (arr1.length)];
        // for (int j = 0; j <= arr1.length - 1; j++) {
        // if (j <= (arr1.length - 2)) {
        // arr1[j] = arr1[j + 1];
        // } else
        // arr1[j] = temp;
        // }

        // }
        // for (int i = 0; i < arr1.length; i++) {
        // System.out.print(arr1[i] + " ");
        // }

        int arr2[] = { 11, 4, 6, 7, 3, 7, 8 };
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the number of rotations :");
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        if (times >= 7) {
            times = times % 7;
            System.out.println(times);
        }
        int temparr[] = new int[times];
        for (int i = 0; i < times; i++) {
            temparr[i] = arr2[i];
        }

        for (int i = 0; i < arr2.length - times; i++) {
            arr2[i] = arr2[i + times];

        }
        for (int j = 0; j < temparr.length; j++) {
            arr2[arr2.length - times + j] = temparr[j];
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
