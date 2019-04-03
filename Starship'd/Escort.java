public class Escort extends Starship {

    public Escort (String newName) {
        name = newName;
        Hull = createStats(new int[] {1000,1250});
        Shield = createStats(new int[] {2500,3000});
        Beam = createStats(new int[] {2500,3000});
        Torp = createStats(new int[] {10,20});
        showStats();

    }


}
