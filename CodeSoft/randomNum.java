

import java.util.*;

public class RandomNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("Guess The Number Game!!");
        String playAgain = "Yes";
        int totalAttempts = 0;
        int roundsWon = 0;
        
        while (playAgain.equalsIgnoreCase("Yes")) {
            int secretNumber = r.nextInt(100) + 1; // Generating a random number between 1-100
            int attempts = 0;
            System.out.println("\nI've picked a number between 1 and 100. Try to guess it!");
            
            while (attempts < 5) {
                System.out.println("Enter your guess: ");
                int userGuess;
                
                try {
                    userGuess = scanner.nextInt();
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Clear the input buffer
                    continue;
                }
                attempts++;
                
                if (userGuess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number " + secretNumber + " in " + attempts + " attempts!");
                    roundsWon++; 
                    totalAttempts += attempts;
                    break;
                }
            }
            
            if (attempts == 5) {
                System.out.println("\nSorry, you've reached the maximum number of attempts. The correct number was " + secretNumber + ".");
            }
            
            System.out.println("\nDo you want to play another round? (Yes/No): ");
            playAgain = scanner.next();
        }
        
        if (roundsWon > 0) {
            double averageAttempts = (double) totalAttempts / roundsWon;
            System.out.println("\nYou won " + roundsWon + " rounds with an average of " + String.format("%.2f", averageAttempts) + " attempts per round.");
        } else {
            System.out.println("Thank you for playing! Goodbye!!");
        }
        
        scanner.close();
    }
}

