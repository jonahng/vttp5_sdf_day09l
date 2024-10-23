import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class NumberGuesser{

    public class randomGenerator{
        

    }

    public static void main(String[] args) throws IOException {
        
        String userInput = "";
        ArrayList<String> userInputHistory = new ArrayList<String>();
        Random rand = new Random();
        int randomNumber = rand.nextInt(999999);
        File file = new File(System.getProperty("user.dir"),"correctAnswer.txt");
        file.createNewFile();
        FileWriter fWriter = new FileWriter("correctAnswer.txt");
        fWriter.write(String.valueOf(randomNumber));
        fWriter.close();


        while(!userInput.equals("quit")){

            Console console = System.console();
            userInput = console.readLine("Type in your input/guess");
            userInputHistory.add(userInput);
            if(Integer.parseInt(userInput) == randomNumber){
                System.out.println("You guessed the correct number! The number was:" + randomNumber);
                System.out.println("Restarting game! Guess the new Number!");
                randomNumber = rand.nextInt(999999);
                

            }

            if(Integer.parseInt(userInput) < randomNumber){
                System.out.println("Your guess is lower than the number!" + randomNumber);
                System.out.println("Your guesses so far were:" + userInputHistory);
            }

            if(Integer.parseInt(userInput) > randomNumber){
                System.out.println("Your guess is higher than the number!");
                System.out.println("Your guesses so far were:" + userInputHistory);
            }



        }
    }


}