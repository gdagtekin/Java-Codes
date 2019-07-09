package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2016
 */
interface Speak {

    String getName();

    String getMessage();
}

abstract class Human implements Speak {

    private final String name;

    protected Human(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Turk extends Human {

    public Turk(String name) {
        super(name);
    }

    public String getMessage() {
        return "Merhaba";
    }

}

class American extends Human {

    public American(String name) {
        super(name);
    }

    public String getMessage() {
        return "Hello";
    }
}

public class PolymorphismSimple {

    public static void main(String[] args) {
        Human turk = new Turk("Gökhan");
        Human american = new American("Micheal");
        System.out.println(turk.getName() + " " + turk.getMessage());
        System.out.println(american.getName() + " " + american.getMessage());
    }

}
