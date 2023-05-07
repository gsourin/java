/*Write a java program to swap two numbers*/





import java.util.*;
public class SwapTwoNumber {
    static void getswap(int number1, int number2){
        int temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("The two number after swapping: ");
        System.out.println("Number1: "+number1);
        System.out.println("Number2: "+number2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number1: ");
        int number1=sc.nextInt();
        System.out.println("Number2: ");
        int number2=sc.nextInt();
        getswap(number1, number2);
    }
}
