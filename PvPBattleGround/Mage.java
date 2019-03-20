import java.util.Random;

public class Mage extends PlayerCharactar {



    public Mage(String newName) {
        System.out.println("\nA mage named " + newName + " has been created.");

        name = newName;
        Random rand = new Random();
        strength = 15 + (rand.nextInt(6)+1)/2;
        intelligence = 15 + 2*(rand.nextInt(6)+1);
        agility = 15 + (rand.nextInt(6)+1);
        hp = strength;

        dispStats();

    }

    public void dispStats() {
        System.out.println(name + " is a mage of strength: " + strength);
        System.out.println(name + " is a mage of intelligence: " + intelligence);
        System.out.println(name + " is a mage of agility: " + agility);
    }
}
