import java.util.*;
public class Gam {
    public static void main(String[] args) {
        int x ; // it will be user's input number
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        do{
            System.out.println("Enter a positive number beetween 1-100");
            x = sc.nextInt();
            if( x ==  randomNumber ) {
                System.out.print("Correct\n");
            }
            else if ( x <  randomNumber ) {
                System.out.println("Your number is less than expected, please enter another number ");
            }
            else if ( x > randomNumber ) {
                System.out.println("Your number is bigger than expected,please enter another number ");
            }

        } while ( x != randomNumber);

    }


}

