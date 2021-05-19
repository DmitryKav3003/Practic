import java.util.Arrays;

class Prob {
    public static void main(String[] args) {
        int[] ppp = new int[3];
        ppp[0] = 11;
        ppp[1] = 3;
        ppp[2] = 16;
        System.out.println(ppp.length);
        System.out.println();
        for (int x = 0;x < ppp.length;x++){
            System.out.println(ppp[x]);
        }
        System.out.println();
        System.out.println(Arrays.toString(ppp));
        Arrays.sort(ppp,0,3);
        System.out.println(Arrays.toString(ppp));
        int key = Arrays.binarySearch(ppp,3);
        System.out.println(key);

    }
}
