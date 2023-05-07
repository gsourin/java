/*11. Write a Java program for following grading system.
Note: Percentage>=90% : Grade A
Percentage>=80% : Grade B
Percentage>=70% : Grade C
Percentage>=60% : Grade D
Percentage>=40% : Grade E
Percentage<40% : Grade F*/





import java.util.*;
public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=80){
            System.out.println("Grade B: ");
        }
        else if(marks>=70){
            System.out.println("Grade C");
        }
        else if(marks>=60){
            System.out.println("Grade D: ");
        }
        else if(marks>=50){
            System.out.println("Grade E: ");
        }
        else if(marks>=40){
            System.out.println("Grade F");
        }
        else if(marks<40){
            System.out.println("Grade B: ");
        }
    }
}
