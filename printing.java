import java.util.Scanner;
public class printing {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            String input = sc.nextLine();
            
            System.out.println("Enter a Number:");
            int input2 = sc.nextInt();
            
            
            System.out.printf("You entered: %s\n" , input);
            System.out.printf("You entered: %d\n" , input2);
        }
    }
}