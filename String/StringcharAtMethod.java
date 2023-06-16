import java.util.*;
public class StringcharAtMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Input A String
        System.out.println("Enter A String: ");
        String str=sc.next();

        //Java charAt() Method Returns A Char Value At The Given Index Number
        System.out.println("Enter The Index Number: ");
        int x=sc.nextInt();
        System.out.println("At The "+x+(" Index Char Is: "+str.charAt(x)));
        sc.close();
    }
}
