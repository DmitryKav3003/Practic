import java.util.ArrayList;

public class Pig {
    String name;
    int size;
    Boolean hall;

    public void setName(String name) {
        this.name = name;
    }                                      //Конструктор походу

    Pig(){
        System.out.println("gggggggggg");
    }

    Pig(int pigSize){
        size = pigSize;
    }

    Pig(Boolean pigHall){
        hall = pigHall;
    }
}

class TestPig{
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.setName("Pepa");
        Pig pig1 = new Pig(56);
        Pig pig2 = new Pig(false);
        System.out.println(pig.name);
    }

}
