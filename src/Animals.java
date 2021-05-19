public class Animals {

    void voice() {
        System.out.println("Голос");
    }
}

class Cat extends Animals{
    @Override
    void voice(){
        System.out.println("Miau");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.voice();
    }
}

class Bear extends Animals{
    @Override
    void voice(){
        System.out.println("rrrrrrrrrr");
    }
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.voice();
    }
}

