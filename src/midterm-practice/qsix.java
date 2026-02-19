/*

Question 6.1

Create a Car class with:

private brand

private year

Add getters and setters.

Create an object and print details.



Question 6.2

Create a Student class with:

private name

private grade

Use getters and setters.

Create an array of 3 students and print their details.



Question 6.3



Create an enum called Level:

BEGINNER

INTERMEDIATE

ADVANCED



Create a Course class that includes this enum as a field.



Question 6.4

Create a Book class with:

private title

private author

private price

Create 3 books in an array and print the most expensive book.



Question 6.5

Create an Employee class with:

private name

private salary

private department (enum)

Create an array of employees and calculate the average salary.

*/


/* Question 6.1

public class Car {

    private String brand;
    private int year;

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setBrand("Toyota");
        myCar.setYear(2020);

        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Year: " + myCar.getYear());
    }
}



*/


/* Question 6.2

public class Student {

    private String name;
    private double grade;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for grade
    public double getGrade() {
        return grade;
    }

    // Setter for grade
    public void setGrade(double grade) {
        this.grade = grade;
    }
}


public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student();
        students[0].setName("Alice");
        students[0].setGrade(88.5);

        students[1] = new Student();
        students[1].setName("Bob");
        students[1].setGrade(92.0);

        students[2] = new Student();
        students[2].setName("Charlie");
        students[2].setGrade(79.3);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Name: " + students[i].getName());
            System.out.println("Grade: " + students[i].getGrade());
            System.out.println();
        }
    }
}

*/

/* Question 6.3

public enum Level {
    BEGINNER,
    INTERMEDIATE,
    ADVANCED
}

public class Course {

    private String title;
    private Level level;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {

        Course c = new Course();
        c.setTitle("Java Programming");
        c.setLevel(Level.INTERMEDIATE);

        System.out.println("Course Title: " + c.getTitle());
        System.out.println("Course Level: " + c.getLevel());
    }
}




*/


/* Question 6.4

public class Book {

    private String title;
    private String author;
    private double price;

    // Getter and setter for title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and setter for author
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and setter for price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[3];

        books[0] = new Book();
        books[0].setTitle("Java Basics");
        books[0].setAuthor("Alice Smith");
        books[0].setPrice(29.99);

        books[1] = new Book();
        books[1].setTitle("Advanced Java");
        books[1].setAuthor("Bob Johnson");
        books[1].setPrice(45.50);

        books[2] = new Book();
        books[2].setTitle("OOP Concepts");
        books[2].setAuthor("Charlie Brown");
        books[2].setPrice(39.75);

        // Find the most expensive book
        Book mostExpensive = books[0];

        for (int i = 1; i < books.length; i++) {
            if (books[i].getPrice() > mostExpensive.getPrice()) {
                mostExpensive = books[i];
            }
        }

        System.out.println("Most Expensive Book:");
        System.out.println("Title: " + mostExpensive.getTitle());
        System.out.println("Author: " + mostExpensive.getAuthor());
        System.out.println("Price: $" + mostExpensive.getPrice());
    }
}



*/

/* Question 6.5

public enum Department {
    HR,
    SALES,
    IT
}

public class Employee {

    private String name;
    private double salary;
    private Department department;

    // Getter and setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for salary
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter and setter for department
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
}

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new Employee();
        employees[0].setName("Alice");
        employees[0].setSalary(50000);
        employees[0].setDepartment(Department.IT);

        employees[1] = new Employee();
        employees[1].setName("Bob");
        employees[1].setSalary(62000);
        employees[1].setDepartment(Department.HR);

        employees[2] = new Employee();
        employees[2].setName("Charlie");
        employees[2].setSalary(58000);
        employees[2].setDepartment(Department.SALES);

        double total = 0;

        for (int i = 0; i < employees.length; i++) {
            total += employees[i].getSalary();
        }

        double average = total / employees.length;

        System.out.println("Average Salary: " + average);
    }
}




*/