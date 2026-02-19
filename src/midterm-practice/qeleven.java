/* Question 11s


Question 11.1 

Create a method

public int add(int a, int b)

Write a JUnit test that verifies:

add(2, 3) returns 5

add(-1, 1) returns 0



Question 11.2

Create a method:

public int getLength(String text)

Write JUnit tests to verify: 

"Hello" returns 5

"" returns 0



Question 11.3

Create a method:

public boolean isEven(int number)



Write JUnit tests to check:

4 returns true

7 returns false



Question 11.4

Create a method:

public double divide(int a, int b)

Write a JUnit test that:

Verifies correct division result

Tests that dividing by 0 throws an exception



Question 11.5

Create a simple Person class with:

name

age



Write JUnit tests to verify:

The constructor sets values correctly

Getters return the correct values

*/


/* Question 11.1

public int add(int a, int b) {
    return a + b;
}

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddTest {

    @Test
    public void testAddPositiveNumbers() {
        assertEquals(5, add(2, 3));
    }

    @Test
    public void testAddNegativeAndPositive() {
        assertEquals(0, add(-1, 1));
    }

    // Method under test
    public int add(int a, int b) {
        return a + b;
    }
}



*/


/* Question 11.2

public int getLength(String text) {
    return text.length();
}

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GetLengthTest {

    @Test
    public void testLengthOfHello() {
        assertEquals(5, getLength("Hello"));
    }

    @Test
    public void testLengthOfEmptyString() {
        assertEquals(0, getLength(""));
    }

    // Method under test
    public int getLength(String text) {
        return text.length();
    }
}


*/


/* Question 11.3

public boolean isEven(int number) {
    return number % 2 == 0;
}

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class IsEvenTest {

    @Test
    public void testEvenNumber() {
        assertTrue(isEven(4));
    }

    @Test
    public void testOddNumber() {
        assertFalse(isEven(7));
    }

    // Method under test
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}


*/


/* Question 11.4

public double divide(int a, int b) {
    if (b == 0) {
        throw new IllegalArgumentException("Cannot divide by zero");
    }
    return (double) a / b;
}

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DivideTest {

    @Test
    public void testNormalDivision() {
        assertEquals(2.5, divide(5, 2));
    }

    @Test
    public void testDivideByZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> divide(10, 0));
    }

    // Method under test
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}


*/

/* Question 11.5

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void testConstructorSetsValues() {
        Person p = new Person("Dragon", 25);

        assertEquals("Dragon", p.getName());
        assertEquals(25, p.getAge());
    }

    @Test
    public void testGettersReturnCorrectValues() {
        Person p = new Person("Alice", 30);

        assertEquals("Alice", p.getName());
        assertEquals(30, p.getAge());
    }
}


*/