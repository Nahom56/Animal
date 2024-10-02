package Exercise4;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("The cat is eating.");
    }

    @Override
    public void drink() {
        System.out.println("The cat is drinking water.");
    }

    @Override
    public void sleep() {
        System.out.println("The cat is sleeping.");
    }

    @Override
    public void workout() {
        System.out.println("The cat is chasing a laser pointer.");
    }
}
