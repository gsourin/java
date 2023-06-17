import java.util.*;
public class String_join_Method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Input A String
        System.out.println("Enter A String: ");
        String str1=sc.next();

        System.out.println("Enter Another String: ");
        String str2=sc.next();

        System.out.println("Enter Another String: ");
        String str3=sc.next();

        //Java String join() Method Returns A String Joined With A Given Delimiter
        System.out.println(String.join("-",str1,str2,str3));
        sc.close();
    }
}
