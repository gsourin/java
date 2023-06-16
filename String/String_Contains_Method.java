import java.util.*;
public class String_Contains_Method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Input A String
        System.out.println("Enter A String: ");
        String str=sc.next();

        //Java String contains() Method Searches The Sequence Of Character In This String
        System.out.println("Enter The Characters To Check: ");
        String str1=sc.next();
        str=str.toLowerCase();
        str1=str1.toLowerCase();
        if(str.contains(str1))
        {
            System.out.println();
            System.out.println(str.contains(str1));
            System.out.println("This String Contains: "+str1);
        }
        else
        {
            System.out.println();
            System.out.println(str.contains(str1));
            System.out.println("This String Not Contains: "+str1);
        }
        sc.close();      
    }
}
