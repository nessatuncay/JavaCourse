/* Question 3

Question 3.1

Ask the user to enter their age as a String. Convert it to an integer and print next year’s age.



Question 3.2

Convert a double value (e.g., 5.75) into an integer and print both values.



Question 3.3

Ask the user for two numbers as Strings. Convert them to doubles and print their average.



Question 3.4

Convert an integer into a double and concatenate it with a sentence.



Question 3.5

Ask the user for a character as a String. Convert it to a float and print it.


*/


/* Question 3.1



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String ageString = input.nextLine();

        int age = Integer.parseInt(ageString);
        int nextYearAge = age + 1;

        System.out.println("Next year, you will be " + nextYearAge + " years old.");
    }
}



*/


/* Question 3.2

public class Main {
    public static void main(String[] args) {
        double value = 5.75;
        int intValue = (int) value;

        System.out.println("Double value: " + value);
        System.out.println("Integer value: " + intValue);
    }
}



*/


/* Question 3.3



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String s1 = input.nextLine();

        System.out.print("Enter the second number: ");
        String s2 = input.nextLine();

        double num1 = Double.parseDouble(s1);
        double num2 = Double.parseDouble(s2);

        double average = (num1 + num2) / 2;

        System.out.println("The average is: " + average);
    }
}



*/



/* Question 3.4

public class Main {
    public static void main(String[] args) {
        int number = 42;
        double converted = (double) number;

        System.out.println("The converted value is " + converted);
    }
}




*/


/* Question 3.5


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String s = input.nextLine();

        char c = s.charAt(0);
        float f = (float) c;

        System.out.println("Float value: " + f);
    }
}




*/