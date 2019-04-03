import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Starship> offense = new ArrayList<Starship>();
        ArrayList<Starship> defense = new ArrayList<Starship>();

        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to name your ship?");
        name = sc.nextLine();
        System.out.println("Would you like to be on offense or defense?");
        boolean side;
        if(sc.nextLine().equals("offense")) {side = true;}
        else {side = false;}
        System.out.println("What type of ship would you like to build?");
        if (sc.nextLine().equals("Escort") && (side == true)) {offense.add(new Escort(name));}
        if (sc.nextLine().equals("Escort") && (side == false)) {defense.add(new Escort(name));}
        if (sc.nextLine().equals("Frigate") && (side == true)) {offense.add(new Frigate(name));}
        if (sc.nextLine().equals("Frigate") && (side == false)) {defense.add(new Frigate(name));}
        if (sc.nextLine().equals("Cruiser") && (side == true)) {offense.add(new Cruiser(name));}
        if (sc.nextLine().equals("Cruiser") && (side == false)) {defense.add(new Cruiser(name));}
        if (sc.nextLine().equals("Battleship") && (side == true)) {offense.add(new Battleship(name));}
        if (sc.nextLine().equals("Battleship") && (side == false)) {defense.add(new Battleship(name));}



    }
}
