//Printing array using_method


public class Array1D1 {
    public static void printarray(int array[])
    {
        System.out.println("Array element are: ");
        for(int i:array){
            System.out.print(i+" ");
        }   
    }
    public static void main(String[] args) {
        int array[]={10,20,30,40,50};
        printarray(array);
    }
}
