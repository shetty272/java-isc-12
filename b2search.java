import java.util.*;
public class b2search {
    
      public static void main(String[] args) {
        
          Scanner in = new Scanner(System.in);
          System.out.println("pls enter your number of element ");
          int n = in.nextInt();
          int arr [] = new int[n];
          
          System.out.println(" pls enter your elements ");

             
          for(int i =0 ; i<n;i++)
          {
              arr[i] = in.nextInt();
          }

           System.out.println("enter your number  to be searched");
           int search = in.nextInt();

             int result = -1;
             int high = n-1;
             int low = 0; 


             while (low<=high) {

                int mid =( high+low)/2;
                
                if (arr[mid]==search)
                {
                    result = mid;
                    break;

                }

                else if (arr[mid]<search)
                {
                    low = mid +1;
                }

                else
                {
                     high = mid -1; 
                }


               
             }

              if ( result == -1)
                {
                    System.out.println("result is not found ");
                }
                
                else
                {
                    System.out.println("here is your number " + result);
                }
        }
}
