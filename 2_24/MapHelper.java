import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MapHelper {
    public static <K, V> V get(Map61B<K, V> sim, K key) {
        if (sim.containsKey(key)) {
            return sim.get(key);
        }
        return null;
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
}
