public class test {
    public static void main(String[] args) {
        Walrus a = new Walrus(1000, 8.3);
        Walrus b;
        b = a;
        b.weight = 5;
        System.out.println(a.weight);
        System.out.println(b.weight);        
    }
}