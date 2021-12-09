package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    public static final int CAPACITY = 20;

    private List<Fish> fishes = new ArrayList<>();

    private int actualCapacity;

    public void addFish(Fish newFish) {
        if (actualCapacity + 5 > CAPACITY) {
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }
        fishes.add(newFish);
        actualCapacity += 5;
    }

    public List<Fish> getFishes() {
        return fishes;
    }

    public List<String> getStatus() {
        List<String> status = new ArrayList<>();
        for (Fish fish : fishes) {
            status.add(fish.getStatus());
        }
        return status;
    }

    public void removeFish(int maxWeight) {
        List<Fish> removable = new ArrayList<>();
        for (Fish fish : fishes) {
            if (fish.getWeight() > maxWeight) {
                removable.add(fish);
            }
        }
        fishes.removeAll(removable);
    }

    public void feed() {
        for (Fish fish : fishes) {
            fish.feed();
        }
    }

    public int getNumberOfFishWithMemoryLoss() {
        int sum = 0;
        for (Fish fish : fishes) {
            if (fish.hasMemoryLoss()) {
                sum++;
            }
        }
        return sum;
    }

    public boolean isThereFishWithGivenColor(String color) {
        for (Fish fish : fishes) {
            if (fish.getColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    public Fish getSmallestFish() {
        Fish smallestFish = fishes.get(0);
        for (Fish fish : fishes) {
            if (fish.getWeight()<smallestFish.getWeight()){
                smallestFish = fish;
            }
        }
        return smallestFish;
    }
}
