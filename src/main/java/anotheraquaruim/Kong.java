package anotheraquaruim;

public class Kong extends Fish {

    private static final boolean memoryLoss = false;

    private static final int weightGain = 2;

    public Kong(String name, int weight, String color) {
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
