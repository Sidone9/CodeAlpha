package CodeAlpha;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int n = random.nextInt(100) + 1;
        System.out.println("#### Welcome to a Number Guessing Game ####");
        System.out.println("----------------------------------------------");
        System.out.print("Guess a Number in between 1 to 100: ");
        boolean guessed = true;
        int count = 0;
        while (guessed) {
            int guess = in.nextInt();
            count++;
            if (guess == n) {
                System.out.println("Congratulations!! You guessed the number in " + count + "th" + " time");
                guessed = false;
            } else if (guess < n) {
                System.out.println("The number you guessed is Lower than the number ");
            } else {
                System.out.println("The number you guessed is  Higher than the Number ");
            }
        }
        in.close();
    }
}