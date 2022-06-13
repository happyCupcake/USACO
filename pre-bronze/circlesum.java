import java.io.*;
import java.util.Scanner;

public class circlesum {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileWriter out = null;

        try {
            in = new FileInputStream("circlesum.in");
            out = new FileWriter("circlesum.out");
            Scanner scanner = new Scanner(in);
            int n = scanner.nextInt();
            int[] list = new int[n];

            for (int i = 0; i < n; i++){
                if (!scanner.hasNextInt() ) {
                    break;
                }
                int x = scanner.nextInt();
                list[i] = x;
            }
            
            int a = 0;
            int b = 0;
            
            for (int i =0; i < n; i++){
                
                b = b + list[i];
                    
                if(b > a){
                    a = b;
                }
                
                if (b<0){ 
                    b=0;
                }
    

            }

            int p = 0;
            int c =0;
            int d = 0;

            for (int i = 0; i < n; i++){
                p += list[i];
                list[i] = list[i]*-1;
    
            }

            for (int i =0; i < n; i++){
                
                d = d + list[i];
                    
                if(d > c){
                    c = d;
                }
                
                if (d<0){ 
                    d=0;
                }

            }

            c += p;

            if (a>c){
                out.write(String.valueOf(a)+ '\n');
            }
            else{
                out.write(String.valueOf(c)+ '\n');
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
