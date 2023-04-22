/*Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using
standard library method for calculating the minimum element.*/




import java.util.*;
public class MinimumElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int minimum=Integer.MAX_VALUE;
        for(int i=0; i<size; i++){
            minimum=Math.min(array[i], minimum);
        }
        System.out.println(minimum);
        sc.close();
    }
}
