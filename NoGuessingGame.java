import java.util.Random;
import java.util.*;

public class NoGuessingGame {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int no= rand.nextInt(100);  //Generating a Random Number between 1 to 100
        int guess, attempt=0;
        System.out.println("Enter the Number Between 1 to 100: ");
        do {
            guess=sc.nextInt();  //Taking User Input
            if (guess==no){
                attempt++;
                System.out.format("Congratulations, You guessed it Correct in %d attempts", attempt);
            }
            else if (guess<no){
                System.out.println("Oops! Too Low");
                System.out.println("Guess a Higher Number");
                attempt++;
            }
            else if (guess>no) {
                System.out.println("Oops! Too High");
                System.out.println("Guess the Lower Number");
                attempt++;
            }
        }
        while (attempt!=10);  //Loop Will Run, till the user guesses the correct number
        if (attempt>=10){
            System.out.println("Sorry! You have attempted more than 10 times."); //Program will terminate after 10 attempts
        }
    }
}
