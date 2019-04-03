public class Battleship extends Starship {

    public Battleship (String newName) {
        name = newName;
        Hull = createStats(new int[] {3000,5000});
        Shield = createStats(new int[] {1500,2000});
        Beam = createStats(new int[] {3000,4000});
        Torp = createStats(new int[] {40,50});
        showStats();
    }
}
