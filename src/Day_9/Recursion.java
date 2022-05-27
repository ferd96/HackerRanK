package Day_9;

public class Recursion {
    public static void main(String[] args) {
         int n  = 3;
         int rs = gt(n);
        System.out.println(rs);

    }
    private static int gt (int i){
       if (i==0){
           return 1;
       }
        return i* gt(i-1);
    }
}
