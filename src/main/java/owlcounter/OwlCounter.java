package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OwlCounter {

    private List<String> owls = new ArrayList<>();

    public void readFromFile(Path path) {
        try {
            owls = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    public int getNumberOfOwls(String s) {
        int result = 0;
        for (String item : owls) {
            if (item.startsWith(s)) {
                return getOwlNumber(item);
            }
        }
        throw new IllegalArgumentException("No such county in Hungary!");
    }

    public int getNumberOfAllOwls() {
        int sum = 0;
        for (String item : owls) {
            sum += getOwlNumber(item);
        }
        return sum;
    }

    private int getOwlNumber(String s) {
        return Integer.parseInt(s.substring(s.indexOf("=") + 1));
    }
}
