import java.util.Iterator;

public class three extends two {
    public int haha() {
        return 0;
    }

    public Iterator iterator() {
        return new threeIterator();
    }
    private class threeIterator implements Iterator {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}
