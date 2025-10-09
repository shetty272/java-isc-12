import java.util.Scanner;

public class recb {


     int binaryrec(int a[] ,int search,int low ,int high) 
    {
            if ( low>high )
            {
                return -1 ;
            }

            int mid = (low+high)/2;

            if (a[mid]== search)
            {
                  return mid ; 
            }

            else if (a[mid]>search)
            {
                
                return binaryrec(a, search, low, mid-1);

            }

            else 
            {
                  return binaryrec(a, search, mid+1, high);
            }
    }



    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("enter the array size ");
        int n = in.nextInt();

        int a[] = new int[n];
         
        System.out.println(" enter the elemnets ");

        for(int i=0 ; i<n;i++)
        {
              a[i] = in.nextInt();
        }

        System.out.println("enter the elemnt to search ");

        int search = in.nextInt();
        
        recb ob = new recb();
        

        int result =ob.binaryrec(a,search,0,a.length-1);
        
        if (result == -1)
        {
             System.out.println("element not found ");
             
             
        }


        else 
        {
            System.out.println("elemnt foud at index " + result);
        
        }
        

        System.out.println();

    }

}