public class Cruiser extends Starship {

    public Cruiser (String newName) {
        name = newName;
        Hull = createStats(new int[] {2000,2500});
        Shield = createStats(new int[] {2000,2500});
        Beam = createStats(new int[] {3000,4000});
        Torp = createStats(new int[] {20,35});
        showStats();
    }

}
