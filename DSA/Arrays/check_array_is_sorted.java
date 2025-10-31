package Arrays;

public class check_array_is_sorted {
    public static void main(String[] args) {
      
        int arr[]={1,2,45,22,56,67,77,79};
        int length=1;
        for(int i =0; i<(arr.length)-1;i++){
            if(arr[i]<=arr[i+1]){
                length=length+1;

            }
        }
        // System.out.println(length);
        // System.out.println(arr.length);
        if(length==arr.length){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        int arr1[]={1,2,22,56,67,77,79};
        boolean flag=true;
        for(int i =0; i<(arr1.length)-1;i++){
            if(arr1[i]>arr1[i+1]){
               flag=false;

            }
        }
        if(flag){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
    }
    
}

//time complexity : O(n)