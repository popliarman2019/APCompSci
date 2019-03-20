import java.util.Random;

public class Paladin extends PlayerCharactar {


    private int constitution;


    public Paladin(String newName) {
        System.out.println("\nA Paladin named " + newName + " has been created.");

        name = newName;
        Random rand = new Random();
        strength = 15 + (rand.nextInt(6)+1);
        intelligence = 30 + (rand.nextInt(6)+1)/2;
        agility = 23 + (rand.nextInt(6)+1);
        constitution = 8 + (rand.nextInt(6)+1);
        hpmax = strength + 2*constitution;
        mpmax = 2*intelligence + constitution;

        dispStats();

    }

    public void dispStats() {
        System.out.println(name + " is a Paladin of strength: " + strength);
        System.out.println(name + " is a Paladin of intelligence: " + intelligence);
        System.out.println(name + " is a Paladin of agility: " + agility);
    }

}
