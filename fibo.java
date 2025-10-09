import java.util.Scanner;

public class fibo {

    int fib ( int num)
    {
         if (num == 0 || num == 1)
         {
              return num;
         }

         return fib (num -1 )+fib (num -2);
    }


    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        System.out.println(" enter the number of term ");
        int num = in.nextInt();
        fibo ob = new fibo();
       
         for ( int i =0 ; i<num ; i++)
         {
            System.out.print(ob.fib(i) + " ");
         }
    }
        
} 
