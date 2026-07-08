import java.util.*;

public class calculator_arpit 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Choose an operation (+, -, *, /): ");
        char operation = sc.next().charAt(0);

        int result = 0;
        switch (operation) 
        {
            case '+':
                result = sum(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = (int) divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation.");
                System.exit(0);
                break;
        }

        System.out.println("Result: " + result);
        sc.close();
    }

    static int sum(int a, int b) 
    {
        return a + b;
    }


    static int subtract(int a, int b) 
    {
        return a - b;
    }

    
    static int multiply(int a, int b) 
    {
        return a * b;
    }


    static int divide(int a, int b) 
    {
        if (b != 0) 
        {
            return a / b;
        } 
        else 
        {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}
