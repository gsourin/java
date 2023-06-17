import java.util.*;
public class String_concat_Method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        //String Input
        System.out.println("Enter A String: ");
        String str1=sc.next();
        System.out.println("Enter Another String: ");
        String str2=sc.next();

        //Java String concat() Method Combines Specified String At The End Of This String

        //The String str1 Does Not Get Changed, Even Though It Is Invoking The Method
        //concat(), As It Is Immutable
        str1.concat(str2);
        System.out.println(str1);

        System.out.println();
        str1=str1.concat(str2);
        System.out.println(str1);
    }
}
