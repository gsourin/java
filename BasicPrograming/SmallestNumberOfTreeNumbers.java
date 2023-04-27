/*Write a Java method to find the smallest number among three numbers.*/




import java.util.*;
public class SmallestNumberOfTreeNumbers {
    static void smallestnumber(int number1, int number2, int number3){
        int x=Math.min(number1, number2);
        int smallest=Math.min(x, number3);
        System.out.println("The smallest number is: "+smallest);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the tree number: ");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        smallestnumber(number1,number2,number3);
        sc.close();
    }
}
