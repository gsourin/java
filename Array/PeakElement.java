/*Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}
Peak element is the one which is greater than its immediate left neighbor and 
its immediate right neighbor. Leftmost and rightmost element cannot be a peak 
element.*/


import java.util.*;
public class PeakElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the array element: ");
        for(int i=0; i<size; i++){
            array[i]=sc.nextInt();
        }
        for(int i=1; i<size-1; i++){
            if((array[i-1]<array[i])&&(array[i]>array[i+1])){
                System.out.println("Peak Value: "+array[i]);
                break;
            }
        }
        sc.close();
    }
}
