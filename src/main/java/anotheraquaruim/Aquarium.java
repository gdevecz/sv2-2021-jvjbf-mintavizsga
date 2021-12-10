package anotheraquaruim;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    public static final int CAPACITY = 20;

    private static final int LIVIG_SPACE = 5;

    private List<Fish> fishes = new ArrayList<>();

    public void addFish(Fish newFish) {
        if (!isEnoughLivingSpaceForNewFish()) {
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }
        fishes.add(newFish);
    }

    public void feed() {
        for (Fish actualFish : fishes) {
            actualFish.feed();
        }
    }

    public void removeFish(int maxWeight) {
        List<Fish> removable = new ArrayList<>();
        for (Fish actualFish : fishes) {
            if (actualFish.getWeight() > maxWeight) {
                removable.add(actualFish);
            }
        }
        fishes.removeAll(removable);
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (Fish actualFish : fishes) {
            result.add(actualFish.getStatus());
        }
        return result;
    }

    public int getNumberOfFishWithMemoryLoss() {
        int sumMemoryLoss = 0;
        for (Fish actualFish : fishes) {
            if (actualFish.isMemoryLoss()) {
                sumMemoryLoss++;
            }
        }
        return sumMemoryLoss;
    }

    public boolean isThereFishWithGivenColor(String color) {
        for (Fish actualFish : fishes) {
            if (actualFish.getColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    public Fish getSmallestFish() {
        Fish smallest = fishes.get(0);
        for (Fish actualFish : fishes) {
            if (actualFish.getWeight() < smallest.getWeight()) {
                smallest = actualFish;
            }
        }
        return smallest;
    }

    private boolean isEnoughLivingSpaceForNewFish() {
        return (fishes.size() + 1) * LIVIG_SPACE <= CAPACITY;
    }
}
