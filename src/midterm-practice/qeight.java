/* Question 8s

Question 8.1 

Write a program that asks the user to enter a number.

If the number is positive, print "Positive".

If negative, print "Negative".

If zero, print "Zero".



Question 8.2 

Ask the user to enter a test mark (0–100).

Display the grade:

75–100 → Distinction

50–74 → Pass

0–49 → Fail



Question 8.3 

Ask the user for their age and whether they have a driver’s license (true/false).

Only allow them to rent a car if:



They are 21 or older

AND they have a license

Otherwise, print "Not eligible".



Question 8.4 

Ask the user to enter a number (1–7).

Use a switch statement to display the day of the week.

Example:

1 → Monday

2 → Tuesday

...



Question 8.5 

Ask the user to enter:

Two numbers

An operator (+, -, *, /)

Use a switch statement to perform the correct calculation and print the result.



*/


/* Question 8.1



public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}



*/

/* Question 8.2



public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter test mark (0–100): ");
        int mark = input.nextInt();

        if (mark >= 75 && mark <= 100) {
            System.out.println("Distinction");
        } else if (mark >= 50 && mark <= 74) {
            System.out.println("Pass");
        } else if (mark >= 0 && mark <= 49) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid mark");
        }
    }
}

*/


/* Question 8.3



public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Do you have a driver's license (true/false): ");
        boolean hasLicense = input.nextBoolean();

        if (age >= 21 && hasLicense) {
            System.out.println("You are eligible to rent a car.");
        } else {
            System.out.println("Not eligible");
        }
    }
}



*/

/* Question 8.4



public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (1–7): ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}


*/

/* Question 8.5


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = input.next().charAt(0);

        double result;

        switch (op) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}



*/