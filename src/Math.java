public class Math {
    int b = 3;
    int getb(){
        return b;
    }

    public static void main(String[] args) {
//        String[] slovo1 = {"privet", "hai", "zdorov"};
//        String[] slovo2 = {"drug", "vrag", "nedrug"};
        String[] rech = new String[3];
        rech [0] = "hai";
        rech [1] = "privet";
        rech [2] = "zdorov";

        String[] drvd = new String[3];
        drvd [0] = "vrag";
        drvd [1] = "drug";
        drvd [2] = "nedrug";


        int one = rech.length;
        int two = drvd.length;
        int sl1 = (int) (java.lang.Math.random() * one);
        int sl2 = (int) (java.lang.Math.random() * two);
        String phrase = rech [sl1] + " " + drvd [sl2];
        System.out.println(phrase);

        Math math = new Math();
        System.out.println(math.getb());
    }


}