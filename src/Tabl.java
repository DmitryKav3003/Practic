import java.util.Scanner;

public class Tabl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > c) {
            if (c > b) {
                System.out.println("Наименьшее число из: " + a + " " + b + " " + c);
                System.out.println(b);
            } else {
                System.out.println("Наименьшее число из: " + a + " " + b + " " + c);
                System.out.println(c);
            }
        } else{
            if (a > b) {
                System.out.println("Наименьшее число из: " + a + " " + b + " " + c);
                System.out.println(b);
            } else {
                System.out.println("Наименьшее число из: " + a + " " + b + " " + c);
                System.out.println(a);

            }
        }
    }
}



