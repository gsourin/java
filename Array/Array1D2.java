//Java Program to demonstrate the way of passing an anonymous array  
public class Array1D2 {
    public static void printingarray(int array[])
    {
        System.out.println("Array element are: ");
        for(int i:array){
            System.out.print(i+" ");
        }   
    }
    public static void main(String[] args) {
        printingarray(new int[]{10,20,30,40,50});
    }
}
