import java.io.*;
import java.util.*;

public class spiralprint {
    public static void main(String args[]) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;
   

        try {
            in = new BufferedReader(new FileReader("spiralprint.in"));
            out = new BufferedWriter(new FileWriter("spiralprint.out"));

            StringTokenizer st = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(st.nextToken());
            System.out.println(n);
            int [][] board = new int[n][n];

            for(int i = 0; i <n; i ++){
                st = new StringTokenizer(in.readLine());
                for(int j = 0; j <n; j ++){
                    //System.out.println(i);
                    //System.out.println(j);
                    int x = Integer.parseInt(st.nextToken());
                    board[i][j] = x;
                    //System.out.println(x);
                    
                }
            }

            
            int k = 0;
            int q = n*n;
            int p = 0;

            for(int i = 0;i <n; i++){
                out.write(String.valueOf(board[0][i])+ '\n');
                k++;
            }

            while(k < q){

               

                for(int i = p;i < n-1; i++){
                    //System.out.println(p);
                    out.write(String.valueOf(board[1+i][n-1]) + '\n');
                    //System.out.println("hi " + String.valueOf(1+i)+"bye "+String.valueOf(n-1));
                    k++;
                }

                for(int i = p; i < n-1; i++){
                    out.write(String.valueOf(board[n-1][n-2-i+p]) + '\n');
                    //System.out.println("hi: " + String.valueOf(n-1)+"bye: "+String.valueOf(n-2-i));
                    k++;
                }

                for(int i = p ;i < n-2; i++){
                    out.write(String.valueOf(board[n-2-i+p][p]) + '\n');
                    //System.out.println("hi: " + String.valueOf(n-2-i)+"bye: "+String.valueOf(p));
                    k++;
                }

                for(int i = p ;i < n -2 ; i++){
                    out.write(String.valueOf(board[0+1+p][i+1])+ '\n');
                    k++;
                }

                p+= 1;
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
