import java.util.*;
public class Average1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ranage of numbers to calculate the sum: ");
        int number=sc.nextInt();
        double sum=(double)(number*(number+1))/2;
        double aver=sum/number;
        System.out.println("Sum is: "+sum);
        System.out.println("Average is: "+aver);
        sc.close();
    }
}