import java.util.Scanner;

public class LinearSearch{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter the size of an array");
   int x= sc.nextInt();
   int arr[]=new int[x];
   System.out.println("Enter the values of array");
   for(int i =0; i<arr.length;i++){
    arr[i]=sc.nextInt();
   }
   System.out.println("your array is : ");
   for(int i = 0 ; i< arr.length;i++){
    System.out.print(arr[i]+" ");
   }
   System.out.println("Finding the element in the array");
   System.out.println("~~~~~~~~~~~~~~~~~~");
   System.out.println("Enter the element you want to find");
   int z=sc.nextInt();
   int flag =0;
   for(int i =0; i<arr.length;i++){
    if (z==arr[i]) {
        System.out.println("we found the element at : "+(i+1)+" index");
        flag ++;
        }
  
    }
    if(flag==0)
        System.out.println("Sorry, "+z+" is not in the array");
   sc.close();
}
}