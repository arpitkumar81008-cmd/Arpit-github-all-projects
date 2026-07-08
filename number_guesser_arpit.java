import java.util.*;

public class number_guesser_arpit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number = (int)(10 * Math.random()) + 1;

        System.out.println("Guess a number between 1 and 10: ");
        int gussed_number = sc.nextInt();
        System.out.println("Your guess: " + gussed_number);
        System.out.println("The number chosen: " + number);

        System.out.println("Did you guess it right? " + (gussed_number == number ? "Yes" : "No"));
        sc.close();
    }
}