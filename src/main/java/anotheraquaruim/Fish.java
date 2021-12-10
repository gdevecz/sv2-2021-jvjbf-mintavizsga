package anotheraquaruim;

public abstract class Fish {

    private String name;

    private int weight;

    private String color;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getFishStatus() {
        return name + ", weight: " + weight + ", color: " + color;
    }

    public abstract String getStatus();

    public abstract void feed();

    public abstract boolean isMemoryLoss();

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }
}
