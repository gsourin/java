/*Write a Java method to check whether a year (integer) entered by the user is a 
leap year or not.*/




import java.util.*;
public class LeapYear {
    static void checkyear(int year){
        if((year%4==0)||((year%400==0)&&(year%100!=0))){
            System.out.println("Leap Year: ");
        }
        else{
            System.out.println("Not Leap Year: ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year to check leap year or not: ");
        int year=sc.nextInt();
        checkyear(year);
        sc.close();
    }
}
