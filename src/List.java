import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        ArrayList<String> auto = new ArrayList<String>();
        auto.add("BMV");
        auto.add("Wolksvagen");
        auto.add("Mersedes");
        auto.add("Fiat");
        auto.add("Volvo");
        auto.add("Девятка");
        auto.add("Шестерка");
        auto.add("Копейка");
        auto.add("Жигули");
        auto.add("Нива");

        System.out.println(auto.size());
        System.out.println();
        for (int x = 0;x < auto.size();x++){
            System.out.println(auto.get(x));
        }
        System.out.println();
        for (int y =0;y < 5;y++){
            System.out.println(auto.get(y));
        }
        System.out.println();
        int w = 5;
        while (w < 10){
            System.out.println(auto.get(w));
            w++;
        }
        System.out.println();
        auto.set(0,"1");
        auto.set(1,"2");
        for (int q = 0;q < auto.size();q++){
            System.out.println(auto.get(q));
        }

        System.out.println();
        auto.remove(1);
        auto.remove(0);
        auto.remove(7);
        auto.remove(6);
        for (int a = 0;a < auto.size();a++){
            System.out.println(auto.get(a));
        }

        auto.add(0,"Иностранный производитель:");
        auto.add(4,"Отечественный производитель:");
        auto.add(4," ");
        System.out.println();
        for (int g = 0;g < auto.size();g++){
            System.out.println(auto.get(g));
        }
        System.out.println(auto.contains(2));
    }
}