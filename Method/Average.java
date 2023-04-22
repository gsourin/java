/*Write a Java method to compute the average of three numbers.*/




import java.util.*;
class Average{
    public static void average(int number1, int number2, int number3)
    {
        System.out.println("The average of three numbers is: "+(number1+number2+number3)/3);    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        average(number1,number2,number3);
        sc.close();
    }
}