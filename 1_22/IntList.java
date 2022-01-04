import java.io.ObjectInputStream.GetField;
import java.time.temporal.TemporalAdjuster;
import java.util.LinkedList;

public class IntList {
    int data;
    IntList next;

    public IntList(int d, IntList nex) {
        this.data = d;
        this.next = nex;
    }

    /**
     * IntList iterativeSize
     * @return
     */
    public int size() {
        IntList t = this;
        int LinkList_size = 0;
        while (t != null) {
            LinkList_size++;
            t = t.next;
        }
        return LinkList_size;
    }

    /**
     * IntList RecursionSize
     * @return
     */
    public int RecursionSize() {
        if (this.next == null) {
            return 1;
        }
        return this.next.RecursionSize() + 1;
    }

    /**
     * IntList iterativeGet
     * @param index
     * @return
     */
    public int get(int index) {
        IntList t = this;
        int num = 0;
        while (num != index) {
            t = t.next;
            num++;
        }
        return t.data;
    }

    /**
     * Recurtion get the data of the index
     * @param index target position
     * @param pos current position
     * @return
     */
    public int RecursionGet(int index, int pos) {
        if (pos == index) {
            return this.data;
        }
        return this.next.RecursionGet(index, pos+1);
    }

    /**
     * Recurtion get the data of i
     * @param i
     * @return
     */
    public int TeacherRecursionGet(int i) {
        if (i == 0) {
            return data;
        }
        return next.TeacherRecursionGet(i - 1);
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        // System.out.println(L.size());
        // System.out.println(L.RecursionSize());
        
        System.out.println(L.get(1));
        System.out.println(L.RecursionGet(1, 0));
        System.out.println(L.TeacherRecursionGet(1));
    }
}
