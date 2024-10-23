import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NumberGuesser{

    public static Integer randomGenerator(){
        Random rand = new Random();
        int randomNumberGenerated = rand.nextInt(999999);
        return randomNumberGenerated;
    }

    public static void writeToFile(String thingsToWrite) throws IOException{
        FileWriter fWriter = new FileWriter("correctAnswer.txt");
        fWriter.write(thingsToWrite);
        fWriter.close();
    }

    public static void readFile(File file) throws FileNotFoundException{
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String fileOutput = scanner.nextLine();
            System.out.println("The output from the txt file is:" + fileOutput);
        }

    }

    public static void main(String[] args) throws IOException {
        
        String userInput = "";
        ArrayList<String> userInputHistory = new ArrayList<String>();
        Integer randomNumber = randomGenerator();
       
        File file = new File(System.getProperty("user.dir"),"correctAnswer.txt");
        file.createNewFile();

        writeToFile(String.valueOf(randomNumber));

        while(!userInput.equals("quit")){

            Console console = System.console();
            userInput = console.readLine("Type in your input/guess");
            userInputHistory.add(userInput);
            if(Integer.parseInt(userInput) == randomNumber){
                System.out.println("You guessed the correct number! The number was:" + randomNumber);
                System.out.println("Restarting game! Guess the new Number!");
                randomNumber = randomGenerator();
                writeToFile(String.valueOf(randomNumber));
                
                continue;

            }
            
            if(Integer.parseInt(userInput) < randomNumber){
                System.out.println("Your guess is lower than the number!" + randomNumber);
                System.out.println("Your guesses so far were:" + userInputHistory);
            }

            if(Integer.parseInt(userInput) > randomNumber){
                System.out.println("Your guess is higher than the number!");
                System.out.println("Your guesses so far were:" + userInputHistory);
            }
            
            readFile(file);



        }
    }


}