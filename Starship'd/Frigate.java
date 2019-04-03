public class Frigate extends Starship {


    public Frigate (String newName) {
        name = newName;
        Hull = createStats(new int[] {1500,2000});
        Shield = createStats(new int[] {2000,2500});
        Beam = createStats(new int[] {2500,3500});
        Torp = createStats(new int[] {20,30});
        showStats();
    }
}
