import java.util.Scanner;

public class lucky__number {


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no of element to be insreted in array");
        int n = in.nextInt();
        int elements =n;

       int arr[] = new int[n];
       System.out.println("Pls enter your array");

       for ( int i =0 ;i<n;i++)
       {
             arr[i] = in.nextInt();
       }


       int del = 1 ;

       while (del < n) {

          for (int i = del; i <n; i+=del) 
          {

            for(int j =i;j<n-1;j++)
            {
                arr[j]= arr[j+1];
            }
            
            n--;
            
          }
          del++;

          for (int i=1;i<n;i++)
          {
              System.out.print(arr[i]+" ");
          }

          System.out.println();
        
       }
             System.out.print("\nHence, the Lucky Numbers Less than "+elements+" are: ");

       for (int i=1;i<n;i++)
          {
              System.out.print(arr[i]+"");
          }
    }

}
