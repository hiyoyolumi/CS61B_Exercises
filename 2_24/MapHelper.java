import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MapHelper {
    public static <K, V> V get(Map61B<K, V> sim, K key) {
        if (sim.containsKey(key)) {
            return sim.get(key);
        }
        return null;
    }

    public static <K extends Comparable<K>, V> K MaxKey(Map61B<K, V> m) {
        List<K> keyList = m.keys();
        K largestK = keyList.get(0);
        for (K k : keyList) {
            if (k.compareTo(largestK) > 0) {
                largestK = k;
            }
        }
        return largestK;
    }

    @Test
    public void testGet() {
        Map61B<String, Integer> m = new ArrayMap<>();
        m.put("horse", 3);
        m.put("fish", 9);
        m.put("house", 10);

        Integer actual = MapHelper.get(m, "fish");
        Integer expect = 9;
        assertEquals(expect, actual);

        assertEquals(null, MapHelper.get(m, "asdasdqweas"));
    }

    @Test
    public void tesMaxKey() {
        Map61B<String, Integer> m = new ArrayMap<>();
        m.put("horse", 3);
        m.put("fish", 9);
        m.put("house", 10);

        String actual = MapHelper.MaxKey(m);
        String expect = "house";
        assertEquals(expect, actual);
    }
}
