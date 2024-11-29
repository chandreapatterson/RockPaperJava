package rockPaperScissors;

// Import required classes for random number generation and scheduling tasks
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        // Create a Timer object to handle the countdown
        Timer countdown = new Timer();

        // Array of choices for the computer in Rock, Paper, Scissors
        String[] computerChoices = {"Rock", "Paper", "Scissors"};
        
        // Initialize Random for generating random choices
        Random random = new Random();

        // Define the task that runs periodically
        TimerTask shoot = new TimerTask() {
            int counter = 3; // Countdown starts from 3

            @Override
            public void run() {
                if (counter > 0) {
                    // Print countdown message (Rock, Paper, Scissors...)
                    System.out.println(computerChoices[3 - counter] + "...");
                    counter--;
                } else {
                    // Generate a random choice for the computer
                    int x = random.nextInt(3);
                    System.out.println("\nShoot!    " + computerChoices[x]);
                    // Cancel the timer after displaying the result
                    countdown.cancel();
                }
            }
        };

        // Schedule the task to run every 1 second
        countdown.scheduleAtFixedRate(shoot, 0, 1000);
    }
}
