public class CarConstruct {
    int maxSpeed;
    String name;

    CarConstruct (int maxSpeed, String name){
        this.maxSpeed = maxSpeed;                 // Обязательные поля, без них
        this.name = name;                         // скомпилируется, но будет по нулям...
    }

    public static void main(String[] args) {
        CarConstruct auto = new CarConstruct(300, "Bugatti");
        System.out.println(auto.name);
        System.out.println(auto.maxSpeed);
    }
}

class Cats{
    int age;
    String name;
    int weith;

    Cats(int age, String name){
        this.age = age;
        this.name = name;         //пример перегруженного конструктора
    }                             //очень похоже на перегруженный метод
    Cats(String name, int weith){
        this.name = name;
        this.weith = weith;
    }

    public static void main(String[] args) {
        Cats tom = new Cats(12, "Tom");
        Cats ken = new Cats("Ken", 7);
        System.out.println(tom.age);
    }
}
/////////////////////////////////////////////////////////////////////

