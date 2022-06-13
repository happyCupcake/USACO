public class addNumbers{
    public static void main(String[] args) {
        int[] list = {2,6,3,7};
        int hi = addnumbers(list);
        System.out.println(hi);

    }
 static int addnumbers(int[] arr1){
        int j = arr1[0];
        for (int i=1; i < arr1.length;  i++){
            j += arr1[i];
        
        }
        return(j);
    }
}