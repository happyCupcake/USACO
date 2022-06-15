import java.io.*;
import java.util.Scanner;

public class square {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileWriter out = null;

        try {
            in = new FileInputStream("square.in");
            out = new FileWriter("square.out");
            Scanner scanner = new Scanner(in);
            int[] rect1 = new int[4];
            int[] rect2 = new int[4];
            for(int i = 0;i<4;i++){
                int n = scanner.nextInt();
                rect1[i] = n;
            }
            for(int i = 0;i<4;i++){
                int x = scanner.nextInt();
                rect2[i] = x;
            }

            int diffy = Math.min(rect1[1], rect2[1]);
            int diffy1 = Math.max(rect2[3], rect1[3]);

            int diffx = Math.min(rect1[0], rect2[0]);
            int diffx1 = Math.max(rect1[2], rect2[2]);

            int squarey = diffy1 - diffy;
            int squarex = diffx1 - diffx;

            System.out.println(squarey);
            System.out.println(squarex);

            if (squarey > squarex){
                out.write(String.valueOf(squarey*squarey)+ '\n');
            }
            else{
                out.write(String.valueOf(squarex*squarex)+ '\n');
            }


        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

    }
}