import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();
            System.out.println(
                    "Operations can be performed using the given numbers (" + num1 + " and " + num2 + ") are:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            System.out.print("Enter the choice to perform on your numbers: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Result of Addition: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result of Subtraction: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result of Multiplication: " + (num1 * num2));
                    break;
                case 4:
                    try {
                        if (num2 == 0) {
                            throw new ArithmeticException("Division by zero");
                        }
                        System.out.println("Result: " + (num1 / num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: Division by zero is not allowed.");
                        System.out.println("Type of error: ArithmeticException");
                        System.out.println("Error message: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error!! Please give proper input.");
            System.out.println("Type of error: InputMismatchException");
            System.out.println("Error message: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");
            System.out.println("Type of error: " + e.getClass().getSimpleName());
            System.out.println("Error message: " + e.getMessage());
        }
    }
}
