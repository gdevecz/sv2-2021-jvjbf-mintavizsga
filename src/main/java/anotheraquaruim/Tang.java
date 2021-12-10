package anotheraquaruim;

public class Tang extends Fish {

    private static final boolean memoryLoss = true;

    private static final int weightGain = 1;

    public Tang(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public String getStatus() {
        return getFishStatus() + ", short-term memory loss: " + memoryLoss;
    }

    @Override
    public void feed() {
        setWeight(getWeight() + weightGain);
    }

    @Override
    public boolean isMemoryLoss() {
        return memoryLoss;
    }
}
