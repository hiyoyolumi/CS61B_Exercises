import java.util.Comparator;

public class Dog implements Comparable<Dog> {
    private int size;
    private String name;

    public Dog(int size, String name) {
        this.size = size;
        this.name = name;
    }
    public Dog() {}


    public void bark() {
        System.out.println(name + "bbbbbbbb");
    }

    public int compareTo(Dog o) {
        return this.size - o.size;
    }


    private static class NameComparator implements Comparator<Dog> {
        public int compare(Dog o1, Dog o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    public static Comparator<Dog> getNameComparator() {
        return new NameComparator();
    }

    private static class SizeComparator implements Comparator<Dog> {
        public int compare(Dog o1, Dog o2) {
            return o1.size - o2.size;
        }
    }

    public static Comparator<Dog> getSizeComparator() {
        return new SizeComparator();
    }
}