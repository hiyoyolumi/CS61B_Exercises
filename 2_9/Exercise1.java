import java.util.*;

public class Exercise1 {
    public static List<String> getWords() {
        In in = new In();
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
            if (counts.containsKey(s)) {
                counts.put(s, counts.get(s) + 1);
            }
        }
        return counts;
    }

    public static void main(String[] args) {
        List<String> words = getWords();
        System.out.println(words);
        int counts = countUniqueWords(words);
        System.out.println(counts) ;
    }
}