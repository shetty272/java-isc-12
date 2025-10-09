import java.util.Scanner;

public class Armstrongnumber {

      public static void main(String[] args) {
                 int d ;
                 int b =0 ;
                 int h ;

                 
             Scanner in = new Scanner(System.in);
             System.out.println("pls enter your number");
             int m = in.nextInt();

             int n=m;

             while ( m >0)
             {
                  d = m%10;
                  b = b + d*d*d;
                  m = m/10;
             }

             if ( b== n  )
             {
                  System.out.println("yes");
             }

             else{
                System.out.println("no");
             }
      }

}
