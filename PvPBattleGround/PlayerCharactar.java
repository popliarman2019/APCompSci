public abstract class PlayerCharactar {

    String name;

    int strength, agility, intelligence;

    int hp, hpmax;
    int mp, mpmax;

    public static int count;


    public PlayerCharactar() {
        System.out.println("Player Charactar extended class created.");

        count++;
    }

    public void dispStats() {

    }


}

