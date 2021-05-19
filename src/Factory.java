public class Factory {
    String name;
    int age;
    int num;

    int skm;
                                           // тоже пример конструктора
    void info(){
        System.out.println(num/age);
    }

    public int getSkm() {
        return num/age;
    }


    Factory (String name, int age, int num){
        this.name = name;
        this.age = age;
        this.num = num;
    }

    public static void main(String[] args) {
        Factory factory = new Factory("Golf", 10, 1900);
        factory.info();                   // не понимаю как вывел
        System.out.println(factory.age);
        System.out.println(factory.getSkm());
    }
}

