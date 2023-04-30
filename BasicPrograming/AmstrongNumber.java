/*Armstrong number*/




import java.util.*;
public class AmstrongNumber {
    static int getamstrong(int number){
        int sum=0;
        while(number!=0){
            int num=number%10;
            sum=sum+(num*num*num);
            number=number/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        int x=getamstrong(number);
        if(number==x){
            System.out.println("Amstrong Number: ");
        }
        else{
            System.out.println("Not A Amstrong Number. Enter Another Number.: ");
        }
    }
}
