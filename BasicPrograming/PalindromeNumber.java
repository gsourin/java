/*Palindromic number*/




import java.util.*;
public class PalindromeNumber {
    static int getpalindrome(int number){
        int sum=0;
        while(number!=0){
            int num=number%10;
            sum=((sum*10)+num);
            number=number/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        int x=getpalindrome(number);
        if(x==number){
            System.out.println("Palindrome Number: ");
        }
        else{
            System.out.println("Not A Palindrome Number. Enter An Another Number.: ");
        }
    }    
}
