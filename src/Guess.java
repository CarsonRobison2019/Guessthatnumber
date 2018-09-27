import java.util.Scanner;
public class Guess {
    public static void main(String[] args) {
        Scanner Radar;
        Radar = new Scanner(System.in);
        int secretNumber,Guess;
        secretNumber = (int) (Math.random() * 1000 + 1);


        //Game Zone all players Try go here.
        System.out.println("Hello player. today you will be tested on you number skills. You will be guessing a number");
        System.out.println("Between 1000 and 1. If you fail to do so...");
        System.out.println("You will be terminated no question. what is your first guess?");
        do {
            Guess = Radar.nextInt();
            if (Guess == secretNumber)
                System.out.println("You win you shall see the next day");
            else if (Guess > secretNumber)
                System.out.println("That was a high guess try guessing a lower number you mortal");
            else if (Guess < secretNumber)
                System.out.println("That guess was low try guessing a higher number you mortal.");
        }while (Guess!=secretNumber);

    }

}
