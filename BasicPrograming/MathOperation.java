import java.util.*;

class MathOperation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int number2 = sc.nextInt();
        int addition = number1 + number2; // Addition Operation
        System.out.println("The addition of two number is: " + addition);
        int subtraction = number1 - number2; // Subtraction Operation
        System.out.println("The subtraction of two number is: " + subtraction);
        int multiplication = number1 * number2; // Multiplication Operation
        System.out.println("The multiplication of two number is: " + multiplication);
        int division = number1 / number2; // Division Operation
        System.out.println("The division of two number is: " + division);
        int modulus = number1 % number2; // Modulus Operation
        System.out.println("The modulus of two number is: " + modulus);
        int increment = ++number1; // Increment Operation
        int increment1 = ++number2; // Increment value by 1
        System.out.println("The increment of first number is: " + increment);
        System.out.println("The increment of second number is: " + increment1);
        int decrement = --number1; // Decrement Operation
        int decrement1 = --number2; // Decrement value by 1
        System.out.println("The decrement of first number is: " + decrement);
        System.out.println("The decrement of second number is: " + decrement1);

        // Math.abs()
        int abs1 = Math.abs(number1); // Returns the absolute value
        int abs2 = Math.abs(number2);
        System.out.println("absolute value: " + abs1 + " " + abs2);

        // Math.ceil()
        int ceil1 = Math.abs(number1); // Returns the round value of floating point
        int ceil2 = Math.abs(number2);
        System.out.println("round value of floating point: " + ceil1 + " " + ceil2);

        // Math.min()
        int min = Math.min(number1, number2); // Returns the smallest value of two numbers
        System.out.println("Minimum value: " + min);

        // Math.max()
        int max = Math.max(number1, number2); // Returns the largest value of two numbers
        System.out.println("Maximum value: " + max);

        // Math.pow1()
        double pow = (double) Math.pow(number1, number2); // Returns the value of the first number raised to the power
                                                          // of the second number

        System.out.println("raised to the power: " + pow);

        // Math.sqrt()
        double sqrt1 = (double) Math.sqrt(number1); // Returns the square root value
        double sqrt2 = (double) Math.sqrt(number2);
        System.out.println("Square Root: " + sqrt1 + " " + sqrt2);
        sc.close();
    }
}