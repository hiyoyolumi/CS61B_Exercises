public class SLList {
    private static class IntNode {
        int item;
        IntNode next;
    
        public IntNode(int x, IntNode n) {
            item = x;
            next = n;
        }
    }

    private IntNode first;
    private int size;

    public SLList() {
        size = 0;
        first = null;
    }

    public SLList(int x) {
        size++;
        first = new IntNode(x, null);
    }

    public int size() {
        return size;
    }

    private int sizeRecursion(IntNode p) {
        if (p == null) {
            return 0;
        }
        return sizeRecursion(p.next) + 1;
    }

    public int sizeRecursion() {
        return sizeRecursion(first);
    }

    public int sizeIteration() {
        IntNode t = first;
        int num = 0;
        while (t != null) {
            num++;
            t = t.next;
        }
        return num;
    }

    public void addFirst(int x) {
        size++;
        first = new IntNode(x, this.first);
    }

    public void addLast(int x) {
        size++;

        /** a little ugly */
        if (first == null) {
            first = new IntNode(x, null);
            return;
        }
        IntNode t = first;
        while (t.next != null) {
            t = t.next;
        }
        t.next = new IntNode(x, null);
    }

    public int getFirst() {
        return first.item;
    }

    public void print() {
        IntNode t = first;
        while (t != null) {
            System.out.print(t.item + " ");
            t = t.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SLList L = new SLList();
        L.addLast(20);
        L.addFirst(5);
        L.addLast(15);
        L.print();
        System.out.println("size = " + L.sizeIteration());
        System.out.println("size = " + L.sizeRecursion());
        System.out.println("size = " + L.size());
    }
}
