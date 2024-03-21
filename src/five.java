import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class five {
    public static void main(String[] args) {
        String[] strings = {"gojo", "google", "jogo", "bill", "pup", "cipher", "watchmen",
                "knight", "it", "stand", "sandman", "hydra", "surtr"};

        String[] sortedStrings = radixSort(strings);
        for (String str : sortedStrings) {
            System.out.print(str + ", ");
        }
    }

    private static String[] radixSort(String[] s) {
        int maxLength = 0;
        for (String value : s) {
            maxLength = Math.max(maxLength, value.length());
        }

        for (int position = maxLength - 1; position >= 0; position--) {
            s = countingSortByCharacterPosition(s, position);
        }

        return s;
    }

    private static String[] countingSortByCharacterPosition(String[] s, int position) {
        HashMap<Character, List<String>> charMap = new HashMap<>();
        for (String str : s) {
            char key = position < str.length() ? str.charAt(position) : 0;  // Use 0 for empty
            charMap.putIfAbsent(key, new ArrayList<>());
            charMap.get(key).add(str);
        }

        List<String> sortedList = new ArrayList<>();
        for (int i = 0; i <= 'z'; i++) {
            List<String> bucket = charMap.getOrDefault((char) i, new ArrayList<>());
            sortedList.addAll(bucket);
        }

        return sortedList.toArray(new String[0]);
    }
}