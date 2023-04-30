import java.util.*;
public class InsertionSort {
    static void insertionSort(int array[], int size){
        for(int i=1;i<size;i++){
            int temp=array[i];
            int j=i-1;
            while(j>=0 && array[j]>temp){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;
        }
        System.out.println("Sorted array is: ");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the array size: ");
        int size=sc.nextInt();
        System.out.println("Enter the array element: ");
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        insertionSort(array, size);
    }
}
