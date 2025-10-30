package Arrays;

public class Second_largest_element_without_sorting {
    public static void main(String[] args) {
        int arr[] = { 2, 645, 9, 45, 99, 5, 777, 00, 96, 444 };

        int largest =-1 ;  //777
        int secondLargest =-1;  //645

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {

              
                secondLargest = largest;

              
                largest = arr[i];

            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Second largest element: " + secondLargest);


        // int largest = arr[0];
        // int secondLargest = -1;
        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i] > largest) {
        //         largest = arr[i];
        //     }
        // }
        // System.out.println("Largest is :" + largest);
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] > secondLargest && secondLargest != largest) {
        //         secondLargest = arr[i];
        //     }
        // }
        // System.out.println("secondLargest is :" + secondLargest);


        

        // int largest1 = arr[0];
        // int largest2 = arr[1];

        // for (int i = 2; i < arr.length; i++) {
        // if(largest1>largest2){
        // if(largest2<arr[i]){
        // largest2=arr[i];
        // }

        // }
        // else{
        // if(largest1<arr[i]){
        // largest1=arr[i];
        // }
        // }
        // }
        // System.out.println("the second largeset element is " + largest1);

    }
}
