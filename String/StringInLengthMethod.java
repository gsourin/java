import java.util.*;
public class StringInLengthMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Input A String
        System.out.println("Enter A String: ");
        String str=sc.next();

        //Java length() Method Finds The Length Of A String
        System.out.println("The Length Of The String Is: "+str.length());
        sc.close();
    }
}
