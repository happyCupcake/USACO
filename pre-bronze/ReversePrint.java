import java.io.*;
import java.util.Scanner;

public class ReversePrint {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileWriter out = null;

        try {
            in = new FileInputStream("reverseprint.in");
            out = new FileWriter("reverseprint.out");
            Scanner scanner = new Scanner(in);
            int n = scanner.nextInt();
            int[] list = new int[n];

            for (int i = 0; i < n; i++){
                if (!scanner.hasNextInt() ) {
                    return;
                }
                int x = scanner.nextInt();
                list[i] = x;
                System.out.println(x);
            }
            //int r = list.length;
            while (n > 0){
                out.write(String.valueOf(list[n-1])+ '\n');
                n -= 1;
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
