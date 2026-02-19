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


// Question 1.1


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Your full name is: " + fullName);
    }
}
