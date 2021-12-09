package aquarium;

public class Fish {

    private String name;

    private int weight;

    private String color;

    private boolean memoryLoss;

    private int weightGain;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public Fish(String name, int weight, String color, boolean memoryLoss, int weightGain) {
        this(name, weight, color);
        this.memoryLoss = memoryLoss;
        this.weightGain = weightGain;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }

    public String getStatus() {
        return name + ", weight: " + weight + ", color: " + color + ", short-term memory loss: " + memoryLoss;
    }

    public void feed() {
        weight += weightGain;
    }
}
