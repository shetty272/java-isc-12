import java.util.Scanner;

public class arr {
    
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = in.nextInt();
        int arr [] = new int [n];

        System.out.println("Enter the  element ");

        for (int i = 0 ; i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println("enter the element to be serched ");

        int ser = in.nextInt();
        int postion = -1;
        for ( int j = 0 ;j<n;j++)
        {
            if (arr[j]== ser )
            {
                postion = j; 
                break; 
            }
        }

      if (postion!= -1)
      {
          System.out.println("element was at thhe index " + postion);
      }

      else{

        System.out.println(" element not found ");
      }
 }

}
