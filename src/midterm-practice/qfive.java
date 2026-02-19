/* Question 5s


Question 5.1

Create two methods named multiply():

One takes two integers

One takes three integers



Question 5.2

Create overloaded display() methods:

One prints a String

One prints an int

One prints a double



Question 5.3

Create overloaded area() methods:

One calculates area of a square

One calculates area of a rectangle



Question 5.4

Create overloaded convert() methods:

One converts int to double

One converts double to int



Question 5.5

Create overloaded greet() methods:

One takes no parameters

One takes a name

One takes name and age

*/


/* Question 5.1


public class Main {

    // Method with two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method with three integers
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        System.out.println("Multiply two numbers: " + multiply(3, 4));
        System.out.println("Multiply three numbers: " + multiply(2, 3, 4));
    }
}

*/


/* Question 5.2


public class Main {

    // Prints a String
    public static void display(String text) {
        System.out.println("String: " + text);
    }

    // Prints an int
    public static void display(int number) {
        System.out.println("Integer: " + number);
    }

    // Prints a double
    public static void display(double value) {
        System.out.println("Double: " + value);
    }

    public static void main(String[] args) {
        display("Hello");
        display(42);
        display(3.14);
    }
}


*/

/* Question 5.3

public class Main {

    // Area of a square
    public static double area(double side) {
        return side * side;
    }

    // Area of a rectangle
    public static double area(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println("Area of square: " + area(5));
        System.out.println("Area of rectangle: " + area(4, 6));
    }
}


*/


/* Question 5.4

public class Main {

    // Convert int to double
    public static double convert(int value) {
        return (double) value;
    }

    // Convert double to int
    public static int convert(double value) {
        return (int) value;
    }

    public static void main(String[] args) {
        System.out.println("Int to double: " + convert(7));
        System.out.println("Double to int: " + convert(5.89));
    }
}



*/

/* Question 5.5


public class Main {

    // No parameters
    public static void greet() {
        System.out.println("Hello!");
    }

    // One parameter: name
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Two parameters: name and age
    public static void greet(String name, int age) {
        System.out.println("Hello, " + name + ". You are " + age + " years old.");
    }

    public static void main(String[] args) {
        greet();
        greet("Dragon");
        greet("Dragon", 21);
    }
}

*/