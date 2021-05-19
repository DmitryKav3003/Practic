public interface Swimmable {

    default void run() {
        System.out.println("runrun");
    }

    void swim();
}