package rockPaperScissors;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        Timer countdown = new Timer();
        String[] computerChoices = {"Rock", "Paper", "Scissors"};
        Random random = new Random();

        TimerTask shoot = new TimerTask() {
            int counter = 3;

            @Override
            public void run() {
                if (counter > 0) {
                    System.out.println(computerChoices[3 - counter] + "...");
                    counter--;
                } else {
                    int x = random.nextInt(3);
                    System.out.println("\nShoot!    " + computerChoices[x]);
                    countdown.cancel();
                }
            }
        };

        countdown.scheduleAtFixedRate(shoot, 0, 1000);
    }
}