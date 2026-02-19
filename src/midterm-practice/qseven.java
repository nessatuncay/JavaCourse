/* Question 7s

Question 7.1

Write a program that uses a for loop to print numbers from 1 to 20.



Question 7.2

Write a program that uses a while loop to print numbers from 10 down to 1.



Question 7.3

Write a program that calculates and prints the sum of numbers from 1 to 100 using a for loop.



Question 7.4

Write a program that keeps asking the user to enter a number until they enter 0.

When 0 is entered, print the total sum of all numbers entered.



Question 7.5

Create an array of 5 integers.

Use an enhanced for loop to:

Print each number

Calculate and print the average

*/

/* Question 7.1

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
}



*/

/* Question 7.2

public class Main {
    public static void main(String[] args) {
        int i = 10;

        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}



*/


/*  Question 7.3

public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("Sum from 1 to 100: " + sum);
    }
}


*/

/* Question 7.4

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.print("Enter a number (0 to stop): ");
        number = input.nextInt();

        while (number != 0) {
            sum += number;

            System.out.print("Enter a number (0 to stop): ");
            number = input.nextInt();
        }

        System.out.println("Total sum: " + sum);
    }
}


*/

/* Question 7.5

public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        // Enhanced for loop to print each number
        for (int num : numbers) {
            System.out.println(num);
            sum += num;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Average: " + average);
    }
}


*/