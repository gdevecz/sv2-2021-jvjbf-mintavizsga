package aquarium;

public class Tang extends Fish {

    public static final boolean MEMORYLOSS = true;

    public static final int WEIGHTGAIN = 1;

    public Tang(String name, int weight, String color) {
        super(name, weight, color, MEMORYLOSS, WEIGHTGAIN);
    }
}
