public class Array1D{
    public static void main(String[] args) {
        int array[]=new int[5];                     //Declaration the_array
        array[0]=1;                                 //initialization
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        System.out.println("Array element are: ");
        for(int i=0;i<array.length;i++){                     //Printing    //array.length=array_size
            System.out.print(array[i]+" ");
        }



        int array1[]={10,20,30,40,50};              //Declaration_And_Initialization
        System.out.println();
        System.out.println("Array1 element are: ");
        for(int i:array1){                                   //Printing_using_foreach_loop
            System.out.print(i+" ");
        }
    }
}