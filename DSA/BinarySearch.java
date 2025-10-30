import java.util.Scanner;

public class BinarySearch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 3, 7, 8, 12, 14, 20, 35, 46, 57, 68, 88 };
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;
        System.out.println("Enter the element to find : ");
        int x = sc.nextInt();
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                found = true;
                break;
            } else if (arr[mid] < x) {
                left = mid + 1;
                
            } else {
                right = mid - 1;
            }

        }
        if (!found) {
            System.out.println("not found");
        } else {
            System.out.println("element is found");
        }
    }
}
