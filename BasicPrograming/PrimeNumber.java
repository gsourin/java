//Write A Program To Check Given Number Is Prime Or Not

import java.util.*;
public class PrimeNumber {
    public static int getPrimeNumber(int number)
    {
        int count=0;
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number To Check Prime Or Not: ");
        int number=sc.nextInt();
        int x=getPrimeNumber(number);
        if(x==2)
        {
            System.out.println("Prime Number: ");
        }
        else
        {
            System.out.println("Not Prime Number: ");
        }
        sc.close();
    }
}
