/*Given an unsorted array arr[] of size N having both negative and positive 
integers, place all negative elements at the end of array without changing the 
order of positive elements and negative elements*/


import java.util.*;
public class SortingByPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size=sc.nextInt();
        System.out.println("Enter the array elements: ");
        int array[]=new int[size];
        for(int i=0; i<size; i++){
            array[i]=sc.nextInt();
        }
        int array1[]=new int[size];
        int index=0;
        for(int i=0; i<size; i++){
            if(array[i]>=0){
                array1[index]=array[i];
                index++;
            }
        }
        for(int i=0;i<size;i++){
            if(array[i]<0){
                array1[index]=array[i];
                index++;
            }
        }
        System.out.println("New array: ");
        for(int j=0; j<size; j++)
        System.out.println(array1[j]);
        sc.close();
    }
}