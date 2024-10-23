import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {
    
    public static void main(String[] args) {
        
    
    String[] suits = { "Spades", "Hearts", "Clubs", "Diamonds"};
    String[] numbers = {"1", "2", "3","4","5", "6", "7", "8", "9","10","11","12","J","Q","K"};
    ArrayList<String> cardDeck = new ArrayList<String>();

    for(String s: suits){
        for(String n: numbers){
            cardDeck.add(n + s);
        }
    }
    System.out.println(cardDeck);
    Collections.shuffle(cardDeck); // this is the easy way to shuffle an arraylist

    System.out.println("Here is the shuffled deck:\n" + cardDeck );
    
}

}
