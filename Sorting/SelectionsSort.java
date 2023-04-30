import java.util.*;

public class SelectionsSort {
    static void selectionsSort(int array[], int size){
        for(int i=0;i<size-1;i++){
            int min=i;
            for(int j=i+1;j<size;j++){
                if(array[j]<array[min]){
                min=j;
                }
            }
            if(min!=i){
                int temp=array[min];
                array[min]=array[i];
                array[i]=temp;
            }
        }
        System.out.println("Sorted Aray is: ");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size=sc.nextInt();
        System.out.println("Enter the array elements: ");
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        selectionsSort(array, size);
    }
}
