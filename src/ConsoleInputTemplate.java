import java.io.Console;

public class ConsoleInputTemplate{

    public static void main(String[] args) {
        
        String userInput = "";

        while(userInput.equals("quit")){

            Console console = System.console();
            userInput = console.readLine("Type in your input/guess");

        }
    }


}