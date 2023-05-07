/*Palindromic number*/




import java.util.*;
public class PalindromeNumber {
    static int getpalindrome(int number){
        int sum=0;
        while(number!=0){                       // 121!=0 True  12!=0 True   1!=0 True  0!=0 False
            int num=number%10;                  // 121%10=1   12%10=2   1%10=1
            sum=((sum*10)+num);                 // (0*10)+1=1  (1*10)+2=12  (12*10)+1=121
            number=number/10;                   // 121/10=12  12/10=1  1/10=0
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
