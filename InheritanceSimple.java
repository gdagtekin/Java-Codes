package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2016
 */
class Cat {

    Cat() {

    }

    int numberOfFeed() {
        return 4;
    }

    int speed() {
        return 10;
    }

}

class Tiger extends Cat {

    Tiger() {
    }

    int kaplanAyak() {
        return numberOfFeed();
    }

    int speed() {
        return 20;
    }

}

public class InheritanceSimple {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        System.out.println("Tiger speed: " + tiger.speed());
        Cat cat = new Cat();
        System.out.println("Cat speed: " + cat.speed());
    }
}
