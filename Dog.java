package Exercise4;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("The dog is eating.");
    }

    public void drink() {
        System.out.println("The dog is drinking water.");
    }

    public void sleep() {
        System.out.println("The dog is sleeping.");
    }

    public void workout() {
        System.out.println("The dog is playing fetch.");
    }
}
