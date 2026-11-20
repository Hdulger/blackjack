import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deck deck =new Deck();
        deck.shuffle();
        ArrayList<Player> players= new ArrayList<>();

        Player player= new Player("Hande");
        players.add(player);
        player=new Player("Samin");
        players.add(player);
        players.add( new Player("Aidana"));
        players.add( new Player("Dave"));
        players.add( new Player("Yahir"));
        players.add( new Player("Nate"));

        for(Player p:players){
            p.takeCard(deck.deal());
            p.takeCard(deck.deal());

        }
        for (Player p: players){
            System.out.println(p.toString());;
        }



    }
}
