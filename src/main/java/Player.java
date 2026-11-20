import java.util.Scanner;

public class Player {
    private String name;
    Hand hand;

    public Player(String name){
        this.name=name;
        this.hand= new Hand();

    }
    String getName(){
        return this.name;
    }
    public String toString(){
        return this.name+" "+this.hand.getValue()+" - ";
    }
    public void takeCard(Card deckCard){
        this.hand.addCard(deckCard);



    }


}
