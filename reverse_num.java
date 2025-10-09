import java.util.*;

public class reverse_num {
   

       public static int  rev_num(int rev,int r)
       {
           if (rev==0)
           {
                return(r);

           }

           else 
           {
               r = r*10 + rev%10;
               return(rev_num(rev/10,r));
           }
       }

     public static void main (String args [])
     {
        Scanner in = new Scanner(System.in);
        
        int rev_input = in.nextInt();
        int res = rev_num(rev_input,0);
        System.out.println("the no is " + res);
     }
}
