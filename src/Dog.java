import java.util.Arrays;

public class Dog {
    int x;

    public void setX(int x) {
        this.x = x;
    }

    void go() {
        System.out.println("fff");
    }

    public static void main(String[] args) {

        Dog[] dog = new Dog[3];
        dog[0] = new Dog();
        dog[1] = new Dog();
        dog[2] = new Dog();

        dog[2].go();

        System.out.println(dog[0].getClass());    //методы класса Object
        System.out.println(dog[1].toString());
        System.out.println(dog[0].hashCode());

        if (dog[0].equals(dog[2])){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        dog[0].setX(44);
        System.out.println(dog[0].x);
    }
}




