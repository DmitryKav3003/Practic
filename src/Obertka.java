public class Obertka {
    Integer i;
    int j;


    public static void main(String[] args) {
        int s = 4;
        int k = 56;
        Integer x = new Integer(22);          //Обертка, класс Integer, их много, на каждый примитив свой
        Obertka t = new Obertka();
        t.go();
        System.out.println(x);
        System.out.println(Integer.max(s,k));
    }
    public void go(){
        Integer j = i;
        System.out.println(j);
        System.out.println(i);
    }
}

class Parse{
    public static void main(String[] args) {
        String x = "11";
        int xx = Integer.parseInt(x);           //строка в число
        System.out.println(xx);

        int y = Integer.MIN_VALUE;              //или любое число
        String st1 = Integer.toString(y);       //преобразование числа в строку
        System.out.println(y);

        //второй способ...
        byte v = 44;              //любой тип
        String vv = String.valueOf(v);
        System.out.println(vv);
    }
}
