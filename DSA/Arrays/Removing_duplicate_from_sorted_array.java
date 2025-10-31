package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Removing_duplicate_from_sorted_array {

    public static void main(String[] args) {
        int arr[]={1,2,4,4,8,8,36,12,34,56,};
        int j=0;
        for(int i =1; i< arr.length-1;i++){
            if(arr[j]!=arr[i]){
                arr[j+1]=arr[i];
                j++;
            }
        }

        for(int i =0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);

    }
}