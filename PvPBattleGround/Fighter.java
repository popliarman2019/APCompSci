import java.util.Random;

public class Fighter extends PlayerCharactar{

    String name;

    int constitution;


    public Fighter(String newName) {
        System.out.println("\nA fighter named " + newName + " has been created.");

        name = newName;
        Random rand = new Random();
        strength = 40 + (rand.nextInt(6)+1)/2;
        intelligence = 10 + 2*(rand.nextInt(6)+1);
        agility = 15 + (rand.nextInt(6)+1);

        dispStats();

    }

    public void dispStats() {
        System.out.println(name + " is a fighter of strength: " + strength);
        System.out.println(name + " is a fighter of intelligence: " + intelligence);
        System.out.println(name + " is a fighter of agility: " + agility);
        System.out.println(name + " is a fighter of constitution: " + constitution);
    }

}
