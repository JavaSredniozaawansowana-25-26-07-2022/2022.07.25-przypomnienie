import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*Cat cat = new Cat();
        cat.age = 5;
        cat.name = "ABC";

        cat.walk();

        Pet p = new Cat();
        p.age = 5;
        p.walk();

        cat.miau();
        if(p instanceof Cat) {
            Cat kot = (Cat) p;
            kot.miau();
        }*/

        LinkedList<String> strings = new LinkedList<>();

        System.out.println(strings.size());

        strings.add("Kot");
        strings.add("Pies");

        System.out.println(strings.size());

        strings.remove(0);

        System.out.println(strings.size());

        System.out.println(strings.get(0));
    }
}
