import java.util.Arrays;

public class Ar2 {
    public static void main(String[] args) {
        int[][] two = new int [2][3];
        two[0][0] = 1;
        two[0][1] = 2;
        two[0][2] = 3;
        two[1][0] = 4;
        two[1][1] = 5;
        two[1][2] = 6;

        System.out.println(two.length);
        System.out.println(two[0].length);
        System.out.println(Arrays.deepToString(two));
        System.out.println();

        for (int x = 0;x < two.length;x++) {
            for (int y =0;y < two[0].length;y++) {
                System.out.print((" " + two[x][y] + " "));
                System.out.println();
            }
        }
        System.out.println();
        for (int d = 0;d < two.length;d++) {
            System.out.println(two[d]);
        }
        System.out.println();

//                int key = Arrays.binarySearch(two,"3");
//                System.out.println(key);
    }


}



