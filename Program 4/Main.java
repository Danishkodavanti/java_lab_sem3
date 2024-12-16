
abstract class Animal {
    // Abstract method eat
    abstract void eat();

    // Abstract method sleep
    abstract void sleep();
}

// Lion class extending Animal
class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("The Lion hunts and eats meat.");
    }

    @Override
    void sleep() {
        System.out.println("The Lion sleeps for 16-20 hours a day.");
    }
}

// Deer class extending Animal
class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("The Deer grazes on grass, leaves, and shrubs.");
    }

    @Override
    void sleep() {
        System.out.println("The Deer sleeps during the night and is alert during the day.");
    }
}

// Tiger class extending Animal
class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("The Tiger hunts and eats large prey like deer or wild boar.");
    }

    @Override
    void sleep() {
        System.out.println("The Tiger sleeps in the shade during the day and hunts at night.");
    }
}

// Main class to test the behavior
public class Main {
    public static void main(String[] args) {
        // Creating objects of Lion, Deer, and Tiger
        Animal lion = new Lion();
        Animal deer = new Deer();
        Animal tiger = new Tiger();

        // Testing the behavior of each animal
        lion.eat();
        lion.sleep();

        deer.eat();
        deer.sleep();

        tiger.eat();
        tiger.sleep();
        System.out.println("NAME:Danish \nUSN:1BM23CS086");
    }
}
