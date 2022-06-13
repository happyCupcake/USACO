import java.io.*;
import java.util.Scanner;

public class CopyMachine {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileWriter out = null;

        try {
            in = new FileInputStream("copymachine.in");
            out = new FileWriter("copymachine.out");
            Scanner scanner = new Scanner(in);
            if (!scanner.hasNextInt() ) {
                return;
            }
            int n = scanner.nextInt();
            System.out.println(n);

            int i=0;
            int x=0;
            while (i<n){
                if (scanner.hasNextInt()) {
                    x = scanner.nextInt();
                }
                    out.write(String.valueOf(x)+ '\n');
                    i ++ ;
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
