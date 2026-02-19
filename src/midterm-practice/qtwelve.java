/* Question 12s

Question 12.1

Write a program that:

Asks the user to enter two integers.

Divides the first number by the second.

Uses a try-catch block to handle division by zero.

If division by zero occurs, print:

Cannot divide by zero!



Question 12.2

Write a program that:

Asks the user to enter an integer.

Uses a try-catch block to handle invalid input (e.g., letters instead of numbers).

If invalid input is entered, print:

Invalid number entered.



Question 12.3

Create an array of 5 integers.

Ask the user to enter an index number.

Use a try-catch block to handle ArrayIndexOutOfBoundsException.

If the index is invalid, print:

Invalid index!



Question 12.4

Write a program that:

Asks the user for two numbers.

Divides them.

Uses multiple catch blocks to handle:

ArithmeticException

InputMismatchException

Print appropriate error messages for each exception.



Question 12.5

Write a program that:

Uses a try-catch-finally block.

In the try block, attempt to divide two numbers.

In the catch block, print an error message.

In the finally block, print:

Program finished.

The finally message must print whether an exception occurs or not.

*/


/* Question 12.1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}

*/



/* Question 12.2

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        try {
            int number = input.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Invalid number entered.");
        }
    }
}

*/

/* Question 12.3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an index: ");

        try {
            int index = input.nextInt();
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
    }
}


*/

/* Question 12.4

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = input.nextInt();

            System.out.print("Enter second number: ");
            int b = input.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers only.");
        }
    }
}


*/

/* Question 12.5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = input.nextInt();

            System.out.print("Enter second number: ");
            int b = input.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("An error occurred during division.");
        } finally {
            System.out.println("Program finished.");
        }
    }
}


*/