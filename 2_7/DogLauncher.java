import java.util.Comparator;

public class DogLauncher {
    public static void main(String[] args) {
        Dog d1 = new Dog(5, "wuwu");
        Dog d2 = new Dog(3, "sansan");
        Dog d3 = new Dog(8, "baba");

        Dog[] dogs = new Dog[] {d1, d2, d3};
        Dog temp = Maximizer.max(dogs);
        temp.bark();

        Comparator<Dog> nc = Dog.getNameComparator();
        if (nc.compare(d1, d3) > 0) {
            d1.bark();
        } else {
            d3.bark();
        }
        // System.out.println(Maximizer.max(dogs));
    }
}
