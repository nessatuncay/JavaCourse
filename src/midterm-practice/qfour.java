/* Questions 4

Question 4.1

Create an array of 5 integers and print all elements using a loop.



Question 4.2

Ask the user to enter 5 numbers and store them in an array. Print the total sum.



Question 4.3

Create an array of 5 double values and print the average.



Question 4.4

Create an array of names and print the longest name.



Question 4.5

Create an integer array and count how many even numbers it contains.


*/


/* Question 4.1

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}



*/


/* Question 4.2


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[5];
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        System.out.println("Total sum: " + sum);
    }
}



*/


/* Question 4.3

public class Main {
    public static void main(String[] args) {
        double[] values = {2.5, 4.0, 6.5, 8.0, 9.5};

        double sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        double average = sum / values.length;

        System.out.println("Average: " + average);
    }
}



*/


/* Question 4.5

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 8, 12, 5, 20};

        int evenCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Number of even values: " + evenCount);
    }
}



*/