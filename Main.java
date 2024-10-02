package Exercise4;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.workout();

        System.out.println(); // Just for spacing

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.workout();
    }
}