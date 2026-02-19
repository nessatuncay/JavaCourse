/* Question 9s

Question 9.1

Write a Java program that checks if a student number:

Starts with "ST"

Followed by exactly 4 digits

Example of valid input:

ST1234

Invalid examples:

st1234

ST12

ST12345



Question 9.2

Write a program that checks if a username:

Is between 5 and 10 characters long

Contains only:

Letters

Numbers

Underscores (_)

Print "Valid username" or "Invalid username".



Question 9.3

Write a program that checks if a name:

Starts with a capital letter

Followed by only lowercase letters

Has no spaces

Example valid input:

Michael

Invalid:

michael

MICHAEL

Michael1



Question 9.4 

Write a program that checks if a product code:

Contains 3 uppercase letters

Followed by a dash (-)

Followed by 3 digits

Example valid input:

ABC-123



Question 9.5

Write a program that checks if a date is in the format:

DD/MM/YYYY



Rules:

2 digits for day

2 digits for month

4 digits for year

Must include slashes

Example:

25/12/2025

(Note: You do NOT need to validate real calendar dates, only the format.)



*/

/* Question 9.1



public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student number: ");
        String studentNum = input.nextLine();

        if (studentNum.matches("ST\\d{4}")) {
            System.out.println("Valid student number");
        } else {
            System.out.println("Invalid student number");
        }
    }
}


*/

/* Question 9.2



public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = input.nextLine();

        // Regex: 5–10 characters, letters/numbers/underscores only
        if (username.matches("[A-Za-z0-9_]{5,10}")) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
    }
}

*/

/* Question 9.3



public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = input.nextLine();

        // Regex: 1 capital letter + 1 or more lowercase letters
        if (name.matches("[A-Z][a-z]+")) {
            System.out.println("Valid name");
        } else {
            System.out.println("Invalid name");
        }
    }
}



*/


/* Question 9.4

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter product code: ");
        String code = input.nextLine();

        // Pattern: 3 uppercase letters, dash, 3 digits
        if (code.matches("[A-Z]{3}-\\d{3}")) {
            System.out.println("Valid product code");
        } else {
            System.out.println("Invalid product code");
        }
    }
}


*/

/* Question 9.5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a date (DD/MM/YYYY): ");
        String date = input.nextLine();

        // Pattern: 2 digits, slash, 2 digits, slash, 4 digits
        if (date.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("Valid date format");
        } else {
            System.out.println("Invalid date format");
        }
    }
}


*/