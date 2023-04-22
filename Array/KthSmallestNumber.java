/*Given an array arr[] and an integer K where K is smaller than size of array, the 
task is to find the Kth smallest element in the given array. It is given that all 
array elements are distinct.*/


import java.util.*;
public class KthSmallestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the array element: ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the position to find the number: ");
        int k=sc.nextInt();
        Arrays.sort(array);
        System.out.println("The element is: "+array[k-1]);
        sc.close();
    }  
}
