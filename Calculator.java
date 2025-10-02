```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");

        // Input first number
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        // Input second number
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Choose operation
        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result;

        switch (op) {
            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operation!");
        }

        sc.close();
    }
}
```
