/* Question 1.1

Write a program that asks the user to enter their full name and prints it back.



Question 1.2

Write a program that asks the user to enter two integers and prints their product.



Question 1.3

Write a program that asks the user to enter a decimal number and prints its square.



Question 1.4

Write a program that asks the user to enter 3 words separately and prints them on one line separated by commas.



Question 1.5

Write a program that asks the user for:



Name

Age

Height */


/* Question 1.1


public class Main {
    public static void main(String[] args) {     Its a string array 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();     Its for users to input their name in the next line

        System.out.println("Your full name is: " + fullName);
    }
}

*/

/* Question 1.2


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();      This is to input integers in the next line

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        int product = num1 * num2;

        System.out.println("The product is: " + product);
    }
}

*/


