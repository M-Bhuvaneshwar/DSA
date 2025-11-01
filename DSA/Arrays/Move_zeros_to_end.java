package Arrays;

public class Move_zeros_to_end {
    public static void main(String[] args) {
        int arr[] = { 2, 0, 0, 0, 4, 5, 0, 0, 3, 4, 0, 6, 4 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) { 
                for (int j = i; j < arr.length; j++) {  
                    if (arr[j] != 0) {
                        arr[i] = arr[j];
                        arr[j] = 0;
                        break; 
                    }
                }
            }
            System.out.println(arr[i]);
            //2
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //worst time complexity = O(n^2)
    }

}
