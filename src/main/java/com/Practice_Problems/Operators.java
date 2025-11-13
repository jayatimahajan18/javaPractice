package com.Practice_Problems;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        try (Scanner operationType = new Scanner(System.in)) {
            System.out.println("What u wnat to do? 1.Number or 2.Name");
            int choice = operationType.nextInt();
            if (choice == 1) {
                System.out.println("Enter two numbers:");
                int num1 = operationType.nextInt();
                int num2 = operationType.nextInt();
                System.out.println("What operation: 1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Equal");
                 int operation = operationType.nextInt();
            int result = 0;
            if (operation == 1) {
                result = add(num1, num2);
                System.out.println("Result: " + result);
            } else if (operation == 2) {
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
            } else if (operation == 3) {
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
            } else if (operation == 4) {
                result = divide(num1, num2);
                System.out.println("Result: " + result);
            } else if (operation == 5) {
                boolean isEqual = equal(num1, num2);
                System.out.println("Are both numbers equal? " + isEqual);

            } else if (operation == 6) {
                boolean startsWithS = checkNameStartWithS(operationType.next());
                System.out.println("Does the name start with S? " + startsWithS);
            }
            } else if (choice == 2) {
                System.out.println("Enter a name:");
                String name = operationType.next();
                boolean startsWithS = checkNameStartWithS(name);
                System.out.println("Does the name start with S? " + startsWithS);
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static boolean equal(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkNameStartWithS(String name) {
        // return name.startsWith("S");
        return name.charAt(0) == 'S';
    }

}
