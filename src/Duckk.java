public class Duckk extends Cat implements Swimmable{
    public void swim(){
        System.out.println("gogogo");
    }

    public static void main(String[] args) {
        Duckk duckk = new Duckk();
        duckk.swim();
        duckk.run();

        Cat cat = new Cat();
        cat.voice();
    }
}
