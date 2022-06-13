import java.io.*;
import java.util.Scanner;

public class water {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileWriter out = null;

        try {
            in = new FileInputStream("water.in");
            out = new FileWriter("water.out");
            Scanner scanner = new Scanner(in);
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            //int z = x;

            for(int i = 0; i<n; i++){
                int y = scanner.nextInt();
                x -= y;
            }
            if( x>=0){
                out.write(String.valueOf(x)+ '\n');
            }
            else{
                out.write(String.valueOf(-1)+ '\n');
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
