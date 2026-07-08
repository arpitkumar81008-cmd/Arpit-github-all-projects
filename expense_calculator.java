import java.util.Scanner;

public class expense_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double totalExpense = 0.0; // Variable to store the total expense


        System.out.println("Welcome to the Expense Calculator!");

        do {
            System.out.print("Enter the expense amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter the expense type (Daily, Weekly, Monthly, Quarterly, Yearly, Onetime): ");
            String expenseType = sc.next();

            totalExpense += calculateExpense(amount, expenseType);

            System.out.println("CurrentTotal Expense: " + totalExpense);
            System.out.println("\n------------------------------------------------\n");
            System.out.println("If you want to add more expenses, type \"yes\" and press Enter.");

        } while (sc.next().toLowerCase().charAt(0) == 'y');

        System.out.println("\n------------------------------------------------\n");
        System.out.println("Total Expense: " + totalExpense);

        sc.close();
    }

    static double calculateExpense(double amount, String expenseType) 
    {
        double totalExpense = 0.0;

        switch (expenseType.toLowerCase()) {
            case "daily":
            case "d":
                totalExpense = amount * 365; // Assuming 365 days in a year
                break;
            case "weekly":
            case "w":
                totalExpense = amount * 52; // Assuming 52 weeks in a year
                break;
            case "monthly":
            case "m":
                totalExpense = amount * 12; // Assuming 12 months in a year
                break;
            case "quarterly":
            case "q":
                totalExpense = amount * 4; // Assuming 4 quarters in a year
                break;
            case "yearly":
            case "y":
            case "onetime":
            case "o":
                totalExpense = amount; // Yearly expense is the same as the input amount
                break;
            default:
                System.out.println("Invalid expense type.");
                break;
        }

        return totalExpense;
    }
}
