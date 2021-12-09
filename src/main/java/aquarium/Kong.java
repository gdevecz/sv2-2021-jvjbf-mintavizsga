package aquarium;

public class Kong extends Fish {

    public static final boolean MEMORYLOSS = false;

    public static final int WEIGHTGAIN = 2;

    public Kong(String name, int weight, String color) {
        super(name, weight, color, MEMORYLOSS, WEIGHTGAIN);
    }
}
