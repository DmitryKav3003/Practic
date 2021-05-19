import java.util.Arrays;

public class Chees {
    public static void main(String[] args) {
        String cheesBoard [][] = new String[8][8];
        for (int x = 0;x < cheesBoard.length;x++){
            for (int y = 0;y < cheesBoard[0].length;y++){
                if ((x + y) % 2 == 0) cheesBoard [x][y] = "W";
                else cheesBoard[x][y] = "B";
                System.out.print(" " + cheesBoard[x][y] + " ");
            }
            System.out.println();
        }
    }
}
