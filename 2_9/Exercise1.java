import java.util.*;

public class Exercise1 {
    public static List<String> getWords(String inputFileName) {
        In in = new In(inputFileName);
        List<String> lst = new ArrayList<>();

        while (!in.isEmpty()) {
            lst.add(in.readString());
        }
        return lst;
    }

    public static int countUniqueWords(List<String> words) {
        Set<String> ss = new HashSet<>();
        for (String s : words) {
            ss.add(s);
        }
        return ss.size();
    }

    public static Map<String, Integer> collectWordCount(List<String> targets, List<String> words) {
        Map<String, Integer> counts = new HashMap<>();
        for (String t : targets) {
            counts.put(t, 0);
        }
        for (String s : words) {
            counts.put(s, counts.get(s) + 1);
        }
        return counts;
    }
}