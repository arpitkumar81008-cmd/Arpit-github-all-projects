import java.util.Scanner;
public class compound_intrest
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double principal, rate, time, n, amount;

        System.out.println("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.println("Enter the rate of interest (in percentage): ");
        rate = scanner.nextDouble();
        System.out.println("Enter the time period (in years): ");
        time = scanner.nextDouble();
        System.out.println("Enter the number of times interest is compounded per year: ");
        n = scanner.nextDouble();

        amount = principal * Math.pow((1 + (rate / (n * 100))), (n * time));
        System.out.printf("The amount after %.2f years is: $ %.2f", time, amount);

        scanner.close();
    }
}