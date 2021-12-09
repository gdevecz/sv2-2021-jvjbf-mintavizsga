package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> getUniqueChars(Object o) {
        if (o == null) {
            throw new IllegalArgumentException("Text is null.");
        }
        List<Character> chars = new ArrayList<>();
        String text = (String) o;
        for (int i = 0; i < text.length(); i++) {
            if (!chars.contains(text.charAt(i))) {
                chars.add(text.charAt(i));
            }
        }
        return chars;
    }
}
