package Arrays;

public class Finding_largest_in_array {
    public static void main(String[] args) {
        int arr[] = { 2, 644, 9, 45, 99, 5, 7, 00, 96, 444 };

        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >largest) {
                largest = arr[i];
            }
        }
        System.out.println("the largeset element is " + largest);
    }
}

//time complexity = O(n)