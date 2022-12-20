import java.util.Random;
import java.util.Scanner;

public class GuessNo {
    public static void main(String[] args) {
        int Answer, Guess;
        final int MAX = 75;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean correct = false;
        Answer = rand.nextInt(MAX) + 1;

        while (!correct) {
            System.out.println("Guess a Number between 1 and 75:");

            Guess = sc.nextInt();
            if (Guess > Answer) {
                System.out.println(" You are Entered a Number to Large, Please Try Again");
            } else {
                if (Guess < Answer) {
                    System.out.println(" You are Entered to Number to Small ,Please Try again");
                } else {
                    System.out.println("Yes,You Guessed the Number !!! .");
                    correct = true;
                }
            }
        }
        System.exit(0);
    }
}
