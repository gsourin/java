/*Write a Java method to count all vowels in a string.*/



import java.util.Scanner;

public class CountingVowels {
    public static void counting(String word)
    {
        int flag=0;
        for(int i=0; i<word.length();i++){
            char ch=word.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                flag++;
            }
        }    
        System.out.println(flag);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word=sc.nextLine();
        word=word.toLowerCase();
        counting(word);
        sc.close();
    }
}
