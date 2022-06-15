import java.io.*;
import java.util.Scanner;

public class billboard {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileWriter out = null;

        try {
            in = new FileInputStream("billboard.in");
            out = new FileWriter("billboard.out");
            Scanner scanner = new Scanner(in);
            long[] rect1 = new long[4];
            long[] rect2 = new long[4];
            for(int i = 0;i<4;i++){
                long n = scanner.nextLong();
                rect1[i] = n;
            }
            for(int i = 0;i<4;i++){
                long x = scanner.nextLong();
                rect2[i] = x;
            }

            long area1 = (rect1[0]-rect1[2]) * (rect1[1]-rect1[3]);
            long area2 = (rect2[0]-rect2[2]) * (rect2[1]-rect2[3]);

            long leftx = Math.max(rect1[0], rect2[0]);
            long rightx = Math.min(rect1[2], rect2[2]);
            long lowy = Math.max(rect1[1], rect2[1]);
            long highy = Math.min(rect1[3], rect2[3]);

            long intx = (rightx - leftx);
            //System.out.println(intx);
            long inty = (highy - lowy);
            //System.out.println(intx);


            long tarpx = (Math.abs(rect1[0]-rect1[2]));
            long tarpy = (Math.abs(rect1[1]-rect1[3]));

            System.out.println(tarpx);
            System.out.println(tarpy);
            System.out.println(intx);
            System.out.println(inty);
            

            if (intx == Math.abs(rect1[0]-rect1[2])){
                tarpy -= inty;
            }
            if (inty == Math.abs(rect1[1]-rect1[3])){
                tarpx -= intx;
            }
            if((rect2[0]> rect1[0] && rect2[2]< rect1[2])||(rect2[1]> rect1[1] && rect2[3]< rect1[3])){
                out.write(String.valueOf(area1)+ '\n');
            }
            else{
                out.write(String.valueOf(tarpx* tarpy)+ '\n');
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
