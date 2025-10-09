import java.util.Scanner;

public class bsearch {


    public static void main(String[] args) {

        System.out.println(" enter your 5 array element ");
        Scanner in = new Scanner(System.in);
        System.out.println("PLS ENTER YOUR NO OF ELEMENT ");
        int n = in.nextInt();
        int arr [] = new int[n];

         for (int i =0 ; i<n;i++)
         {
             arr[i] = in.nextInt();
         }
     
          System.out.println("enter your element ");
        int a = in.nextInt();
        int result = -1;
        int high = n-1 ;
        int low = 0;

        while (low<=high)
        {
            int mid = ( high+low )/2;

            if (arr[mid] == a)
            {
                  result = mid;
                  break;
            }

            else if (arr[mid]<a)
            {
                low = mid +1;
            }

            else
            {
                high = mid -1;
            }
        }

        if (result == -1)
        {
            System.out.println("element not found");
        }

          else 
          {
            System.out.println("element found at the index"  + result);
          }       
    }

}
