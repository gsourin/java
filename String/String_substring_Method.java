import java.util.*;
public class String_substring_Method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Input A String
        System.out.println("Enter A String: ");
        String str=sc.next();

        //Java sustring() Method Returns A Part Of The String
        // str.substring(Index_Number)
        System.out.println("Enter The Index Number: ");
        int index=sc.nextInt();
        System.out.println("Sub String Is: "+str.substring(index));
        System.out.println("Enter The Start Index Number: ");
        int startIndex=sc.nextInt();
        System.out.println("Enter The End Index Number: ");
        int endIndex=sc.nextInt();
        //str.substring(StartIndex,EndIndex)
        System.out.println("Sub String Is: "+str.substring(startIndex, endIndex));
        sc.close();
    }
}
