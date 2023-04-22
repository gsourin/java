/*Write a Java method to display the middle character of a string.
Note: a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.*/




import java.util.*;
public class MiddleCharacter {
    public static void display(String word, int length){
        if(length%2==0){
            System.out.print((word.charAt((length/2)-1)));
            System.out.println(word.charAt(length/2));
        }
        else if(length%2==1){
            System.out.println(word.charAt((length-1)/2));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word=sc.next();
        int length=word.length();
        display(word,length);
        sc.close();
    }
}