import java.io.*;
import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileWriter out = null;

        try {
            in = new FileInputStream("fibonacci.in");
            out = new FileWriter("fibonacci.out");
            Scanner scanner = new Scanner(in);
            int n = scanner.nextInt();
            long a = 0;
            long b = 1;

            if(n == 0 ){
                out.write(String.valueOf(a)+ '\n');
            }
            else if(n == 1 || n == 2){
                out.write(String.valueOf(b)+ '\n');
            }
            //else if(n <= 0){
                //break;
            //}
            else if(n > 2){
                for(int i = 0; i<n-1; i++){
                    long c = a+b;
                    a = b;
                    b = c;
                }
                out.write(String.valueOf(b)+ '\n');
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
