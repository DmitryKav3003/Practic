import java.util.Arrays;

public class Massive {


    public static void main(String[] args) {
        int [] massive = {1,2,2,99,67};

        for (int x:massive) {
            System.out.println(x);
        }
        System.out.println(Arrays.toString(massive));
        System.out.println(massive.length);
        Arrays.sort(massive,0,5);
        System.out.println(Arrays.toString(massive));
        int key = Arrays.binarySearch(massive,2);
        System.out.println(key);


    }
}
