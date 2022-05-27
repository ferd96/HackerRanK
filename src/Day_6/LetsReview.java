package Day_6;

import java.util.Scanner;

public class LetsReview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for ( int i =0 ; i<n;i++){
             String string  = sc.nextLine();
             char [] chars = string.toCharArray();
         for ( int j = 0; j< chars.length;j++){
             if (j%2==0) {
                 System.out.print(chars[j]);
             }
         }
            System.out.println(" ");
            for ( int j = 0; j< chars.length;j++){
                if (j%2!=0) {
                    System.out.print(chars[j]);
                }
            }
        }
    }
}
