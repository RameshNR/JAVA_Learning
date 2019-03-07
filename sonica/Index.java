
public class Index {
       public static int  findIndex (int[]a, int b) {
        if (a== null) return -1;
        int len = a.length;
        int i = 0;
        while (i < len) {
            if (a[i] == b) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] a = {1,5,6,3,4,1};
      System.out.println("Index position of 1 is: " + findIndex(a, 1));
     
}}