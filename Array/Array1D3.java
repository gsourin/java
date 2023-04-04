public class Array1D3{
    public static int[] get(){
        return new int[]{10,20,30,40,50};
    }
    public static void main(String[] args) {
        int[] ar=get();
        System.out.println("Array elements are: ");
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
