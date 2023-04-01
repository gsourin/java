import java.util.*;

class Scanning {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine(); // Scan String
        System.out.println("Enter your age:");
        int age = sc.nextInt(); // Scan Integer
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0); // Scan Character
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("Character is " + ch);
        sc.close();
    }
}