package zadania1i2;
import zadania3i4.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.start();
        car1.stop();
        Lion lion = new Lion();
        lion.makeNoise();
        Dog dog = new Dog();
        dog.makeNoise();
        Cat cat = new Cat();
        cat.makeNoise();
        Wolf wolf = new Wolf();
        wolf.makeNoise();
        lion.roam();
        cat.roam();
        dog.roam();
        wolf.roam();


    }
}