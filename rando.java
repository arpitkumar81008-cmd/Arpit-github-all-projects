import java.util.Random;
public class rando 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        int randomNum = rand.nextInt(101); // Generates a random number between 0 and 100
        System.out.println("Random Number: " + randomNum);

        boolean isheads = rand.nextBoolean(); // Generates a random boolean value
        if (isheads)    
        {
            System.out.println("Heads");
        } 
        else 
        {
            System.out.println("Tails");
        }
    }
}