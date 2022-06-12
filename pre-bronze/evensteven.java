import java.io.*;
import java.util.Scanner;


public class Evensteven {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileWriter out = null;

        try {
            in = new FileInputStream("evensteven.in");
            out = new FileWriter("evensteven.out");
            Scanner scanner = new Scanner(in);
            if (!scanner.hasNextInt() ) {
            return;
            }

            int n = scanner.nextInt();
            int i = 1;
            while(i <= n){
                if (!(i%2 == 1)){
                    out.write(String.valueOf(i + "\n"));
                }
                i ++;
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
