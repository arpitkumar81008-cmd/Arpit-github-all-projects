import java.util.Random;
import java.util.Scanner;

public class HeadsTailsGameSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("--- Heads or Tails Game ---");
        System.out.print("Enter your guess (0 for Heads, 1 for Tails): ");
        
        if (scanner.hasNextInt()) {
            int userGuess = scanner.nextInt();

            if (userGuess != 0 && userGuess != 1) {
                System.out.println("Invalid input! Please run again and enter 0 or 1.");
            } else {
                int coinFlip = random.nextInt(2); // Generates 0 or 1
                String result = (coinFlip == 0) ? "Heads" : "Tails";
                String userChoice = (userGuess == 0) ? "Heads" : "Tails";

                System.out.println("You guessed: " + userChoice);
                System.out.println("The coin landed on: " + result);

                if (userGuess == coinFlip) {
                    System.out.println("🎉 Congratulations! You won!");
                } else {
                    System.out.println("❌ Sorry, you lost.");
                }
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }
        
        scanner.close();
    }
}   