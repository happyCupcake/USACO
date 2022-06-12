import java.io.*;
import java.util.Scanner;
public class SumAll {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileWriter myWriter= null;
 

      try {
         in = new FileInputStream("sumall.in");
         myWriter = new FileWriter("sumall.out");
         //out = new FileOutputStream("sumall.out");
         
         int n;
         Scanner scanner = new Scanner(in);
         if (!scanner.hasNextInt() ) {
           return;
         }
         n = scanner.nextInt();
         
         int c;
         int sum =0;
         
         int i =0;
         System.out.println(n);
         while (i<n) {
            if (!scanner.hasNextInt()) {
               break;
            }
            c = scanner.nextInt();
            System.out.println(c);
            sum  +=c;
            i++;
         }
          
         myWriter.write(String.valueOf(sum));
      } finally {
         if (in != null) {
            in.close();
         }
         if (myWriter != null) {
            myWriter.close();
         }
      }
   }
}