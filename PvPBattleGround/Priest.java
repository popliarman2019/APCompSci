import java.util.Random;

public class Priest extends PlayerCharactar {



    public Priest(String newName) {
        System.out.println("\nA priest named " + newName + " has been created.");

        name = newName;
        Random rand = new Random();
        strength = 15 + (rand.nextInt(6)+1);
        intelligence = 30 + 2*(rand.nextInt(6)+1);
        agility = 15 + (rand.nextInt(6)+1);
        hpmax = strength;


        dispStats();

    }

    public void dispStats() {
        System.out.println(name + " is a priest of strength: " + strength);
        System.out.println(name + " is a priest of intelligence: " + intelligence);
        System.out.println(name + " is a priest of agility: " + agility);
    }


}
