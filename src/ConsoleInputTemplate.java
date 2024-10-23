import java.io.Console;

public class ConsoleInputTemplate{

    public static void main(String[] args) {
        System.out.println("App running!");
        
        String userInput = "";

        while(!userInput.equals("quit")){

            Console console = System.console();
            userInput = console.readLine("Type in your input/guess");
            System.out.println("You typed: " + userInput);

        }
    }


}