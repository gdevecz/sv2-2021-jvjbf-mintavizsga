package aquarium;

public class Clownfish extends Fish {

    public static final boolean MEMORYLOSS = false;

    public static final int WEIGHTGAIN = 1;

    public Clownfish(String name, int weight, String color) {
        super(name, weight, color, MEMORYLOSS, WEIGHTGAIN);
    }
}
