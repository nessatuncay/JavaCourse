/* Question 10s


Question 10.1

Write a program that:

Creates a StringBuilder

Appends your first name

Appends a space

Appends your last name

Prints the final result



Question 10.2

Write a program that:

Asks the user to enter a word

Uses StringBuilder to reverse the word

Prints the reversed word



Question 10.3

Create a StringBuilder with the word "Java"

Insert the word "Programming " at the beginning so the final result becomes: "Programming Java"



Question 10.4

Create a StringBuilder containing: HelloWorld

Remove the word "World" using the delete() method and print the result.



Question 10.5

Create a StringBuilder with: "I like cats"

Replace "cats" with "dogs" using the replace() method.


*/


/* Question 10.1

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("Dragon");   // first name
        sb.append(" ");        // space
        sb.append("Coder");    // last name

        System.out.println(sb.toString());
    }
}

*/

/* Question 10.2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        StringBuilder sb = new StringBuilder(word);

        sb.reverse();

        System.out.println("Reversed word: " + sb.toString());
    }
}


*/


/* Question 10.3

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.insert(0, "Programming ");

        System.out.println(sb.toString());
    }
}


*/


/* Question 10.4

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("HelloWorld");

        // "World" starts at index 5 and ends at index 10 (exclusive)
        sb.delete(5, 10);

        System.out.println(sb.toString());
    }
}


*/

/* Question 10.5

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("I like cats");

        // Replace "cats" (index 7 to 11) with "dogs"
        sb.replace(7, 11, "dogs");

        System.out.println(sb.toString());
    }
}


*/