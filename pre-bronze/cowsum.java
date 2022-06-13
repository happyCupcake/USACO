import java.io.*;
import java.util.Scanner;

public class cowsum {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileWriter out = null;

        try {
            in = new FileInputStream("cowsum.in");
            out = new FileWriter("cowsum.out");
            Scanner scanner = new Scanner(in);
            int n = scanner.nextInt();
            long t = scanner.nextLong();
            long maxweight;
            long maxheight;
            long maxlength;
            long maxwidth;
            

            Cow[] cows = new Cow[n];
            for(int i=0;i<n;i++){
                long h = scanner.nextLong();
                long o = scanner.nextLong();
                long j = scanner.nextLong();
                long k = scanner.nextLong();
                long l = scanner.nextLong();
                long m = scanner.nextLong();
                Cow cow = new Cow(h,o,j,k,l,m);
                cows[i] = cow;
                //cows[i].print();
    
            }
            maxweight = cows[0].weight;
            maxheight = cows[0].height;
            maxlength = cows[0].length;
            maxwidth = cows[0].width;
            int cowtime = 0;
            for(int i = 0; i <n; i++){
                if(t< cows[i].tj && t>= cows[i].ti){
                    if (maxweight < cows[i].weight){
                        maxweight = cows[i].weight;
                    }
                    if (maxheight < cows[i].height){
                        maxheight = cows[i].height;
                    }
                    if (maxlength < cows[i].length){
                        maxlength = cows[i].length;
                    }
                    if (maxwidth < cows[i].width){
                        maxwidth = cows[i].width;
                    }
                    cowtime ++;
                }
                
            }
            if (cowtime == 0){
                maxweight = -1;
                maxheight = -1;
                maxlength = -1;
                maxwidth = -1;
            }

            out.write(String.valueOf(maxweight)+ '\n');
            out.write(String.valueOf(maxheight)+ '\n');
            out.write(String.valueOf(maxlength)+ '\n');
            out.write(String.valueOf(maxwidth)+ '\n');


            

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
class Cow {
    public long weight;
    public long height;
    public long width;
    public long length;
    public long ti;
    public long tj;

    Cow(long weight, long height, long width, long length, long ti, long tj){
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.length = length;
        this.ti = ti;
        this.tj = tj;

    }
    public void print(){
        System.out.println(weight);
        System.out.println(height);
        System.out.println(width);
        System.out.println(length);
        System.out.println(ti);
        System.out.println(tj);

    }
}
