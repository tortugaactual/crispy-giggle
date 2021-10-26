package randomnumberguessinggame;

import java.util.Random; //Required for the Random class.
import java.util.Scanner;//Required for the Scanner class.


/**
 * @author Carlos F Ortega Jr.
 * Date Created: 10/12/2021
 */
public class RandomNumberGuessingGame 
{
    public static void main(String[] args) 
    {
        int number;//Creates the number variable
        int userGuess;//Creates the userGuess variable
        int totalGuesses = 0; // totalGuesses is the accumulator and is set to 0
        Random randomNumbers = new Random();//Creates the randomNumbers variable
        number = randomNumbers.nextInt(15) + 1;//Get a random number between 1 and 15.
        Scanner keyboard = new Scanner(System.in);//Creates the keyboard object for user input.
        
        
        System.out.println(number);
        System.out.println("This is a Random Number Guessing Game.");
        System.out.println("The random number is between 1 and 15. Please, enter your guess: ");
        userGuess = keyboard.nextInt(); 
        
     
        while (userGuess < number)//Checks if the user guess is less than the random number.
        {
            System.out.println("Your guess is less than the random number. Please, enter your guess again: ");
            userGuess = keyboard.nextInt();
            
            while (userGuess > number)//Check if the user guess is greater than the random number.
            {
                System.out.println("Your guess is greater than the random number. Please, enter your guess again: ");
                userGuess = keyboard.nextInt();
            } 
        }
        if (userGuess == number)
            System.out.println("Correct!");           
    }
}    