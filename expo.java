import java.util.Scanner;

public class expo 
{
     int expocount( int base , int power )
     {
        int result;
        if ( power == 0)
        {
            return 1 ; 
        }
     
       result = base * expocount(base , power-1 );
       return result;

     }

       public static void main(String args [])
       {
           Scanner in = new Scanner ( System.in );
           System.out.println ( " pls enter your base and exponent  ");
           int base = in.nextInt();
           int power = in.nextInt();

           expo ob = new expo();

           System.out.println("your result is  " + ob.expocount(base,power));
       }
}