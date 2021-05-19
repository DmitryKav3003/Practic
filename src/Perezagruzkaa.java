//package ModifTest.ru.org;


import java.util.Objects;

class Peregruzkaa {
    int go(){        //Перергузка
        return 1;
    }
    int aa (int x, int y){                 //   Полиморфизм
        return x + y;                      //
    }                                      //   Пример статического связывания(перегрузка)
    double aa (double x, double y){        //
        return x + y;                      //
    }

    Boolean go(Boolean a){         //Перегрузка
        return a;
    }
    void run(){
        System.out.println("man run");
    }
    public static void main(String[] args) {

        Peregruzkaa peregruzka = new Peregruzkaa();
        System.out.println(peregruzka.go());
        System.out.println(peregruzka.go(true));
        System.out.println(peregruzka.aa(1,3));
        System.out.println(peregruzka.aa(3.4, 5.8));

    }
}

class Moto extends Peregruzkaa{
    void run(){
        System.out.println("man seeeee");
    }
}


class Man{
    void sleep(){
        System.out.println("sss");
        int x;
    }
    public static void main(String[] args) {        //Полиморфизм
        Peregruzkaa p = new Moto();                  //Пример динамического связывания, когда метод
        p.run();                                    //определяется во время выполнения
        p = new Peregruzkaa();
        p.run();
        Man man = new Man();
        man.sleep();

    }
}

class Byke extends Man {
}


