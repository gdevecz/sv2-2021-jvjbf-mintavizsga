package anotheraquaruim;

public class Tang extends Fish {

    private static final boolean MEMORY_LOSS = true;

    private static final int WEIGHT_GAIN = 1;

    public Tang(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public String getStatus() {
        return getFishStatus() + ", short-term memory loss: " + MEMORY_LOSS;
    }

    @Override
    public void feed() {
        setWeight(getWeight() + WEIGHT_GAIN);
    }

    @Override
    public boolean isMemoryLoss() {
        return MEMORY_LOSS;
    }
}
