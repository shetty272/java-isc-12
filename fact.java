import java.util.Scanner;

public  class fact 
{
    int factorial (int n )
    {
        int result; 

        if ( n==1 )
        {
         return 1;
        }
         
        result = factorial(n-1)*n ; 
        return result;

    }

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number ");
        int n = sc.nextInt();

        fact ob = new fact();
        System.out.println("factorial is " + ob.factorial(n));

    }
}