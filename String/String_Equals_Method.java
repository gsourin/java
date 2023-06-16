import java.util.*;
public class String_Equals_Method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Input A String
        System.out.println("Enter A String: ");
        String str1=sc.next();

        System.out.println("Enter Another String: ");
        String str2=sc.next();

        System.out.println("Enter Another String: ");
        String str3=sc.next();

        //Java String equals() Method Cmpares The Two Given Strings Based On The Content Of String
        // It Basically Boolean Type

        if(str1.equals(str2))
        {
            System.out.println();
            System.out.println(str1.equals(str2));
            System.out.println("This Two String Are Equals: ");
        }
        else
        {
            System.out.println();
            System.out.println(str1.equals(str2));
            System.out.println("This Two String Are Not Equals: ");
        }

        if(str1.equals(str3))
        {
            System.out.println();
            System.out.println(str1.equals(str3));
            System.out.println("This Two String Are Equals: ");
        }
        else
        {
            System.out.println();
            System.out.println(str1.equals(str3));
            System.out.println("This Two String Are Not Equals: ");
        }
        sc.close();
    }
}
