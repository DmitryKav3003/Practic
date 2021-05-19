public class Nasl {
    int x = 44;
    void go(){
        System.out.println("gogogo");
    }
}

class A1 extends Nasl{
    void jump(){
        System.out.println("Juuuuump");
    }
    public static void main(String[] args) {
        A1 a = new A1();
        a.go();
        a.jump();
    }
}

class B2 extends A1{
    public static void main(String[] args) {
        B2 b = new B2();
        b.go();
        b.jump();
    }

}