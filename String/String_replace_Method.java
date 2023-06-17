import java.util.*;
public class String_replace_Method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        //String Input
        System.out.println("Enter A String: ");
        String str1=sc.next();
        System.out.println("Enter char Or CharSequence To Find: ");
        String str2=sc.next();
        System.out.println("Enter The char Or CharSequence To Replace: ");
        String str3=sc.next();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        str3=str3.toLowerCase();


        //Java String replace() Method Returns A String Replacing All The Old char Or CharSequence To New char Or CharSequence

        System.out.println("Before Replacing: "+str1);
        System.out.println();
        System.out.println("After Replacing: "+str1.replace(str2, str3));
    }
}
