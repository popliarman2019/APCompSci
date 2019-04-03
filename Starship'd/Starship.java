public abstract class Starship {

    protected String name;

    int Hull, Shield, Beam, Torp;


    protected double createStats(int[] range) {
        double a = Math.random()*(range[2]-range[1])+range[1];
        return a;
    }


    protected void showStats() {
        System.out.printf("%s:    Hull: %d    Shield: %d    Beam: %d    Torpedo: %d.", name, Hull, Shield, Beam, Torp);
    }



}
