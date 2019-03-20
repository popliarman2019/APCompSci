import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int val = 5;
        Random rand = new Random();

        Fighter fighter1 = new Fighter("Rethgif");
        Fighter fighter2 = new Fighter ("Catty");

        Priest priest1 = new Priest ("Rhonda");
        Priest priest2 = new Priest ("Wanda");


        Paladin paladin1 = new Paladin ("Nidalap");
        Paladin paladin2 = new Paladin ("Sammy");

        Mage mage1 = new Mage ("Egam");
        Mage mage2 = new Mage ("Sally");

        System.out.println("\nThere are " + PlayerCharactar.count + " charactars in this arena.");

//        PlayerCharactar playerx = new PlayerCharactar("Jonny");


        ArrayList<PlayerCharactar> players = new ArrayList<PlayerCharactar>();
        players.add(fighter1);
        players.add(fighter2);
        players.add(priest1);
        players.add(priest2);
        players.add(paladin1);
        players.add(paladin2);
        players.add(mage1);
        players.add(mage2);

        System.out.println(players.size());


        for (PlayerCharactar x : players) {
            if (x instanceof Fighter) {System.out.println(x.name + " is a Fighter."); x.dispStats();}
            if (x instanceof Priest) {System.out.println(x.name + " is a Priest."); x.dispStats();}
            if (x instanceof Paladin) {System.out.println(x.name + " is a Paladin."); x.dispStats();}
            if (x instanceof Mage) {System.out.println(x.name + " is a Mage."); x.dispStats();}



        }

    }
}
