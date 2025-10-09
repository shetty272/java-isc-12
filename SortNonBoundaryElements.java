import java.util.Scanner;

public class SortNonBoundaryElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];

       
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nOriginal array:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
        
        int nonBoundaryCount = (rows - 2) * (cols - 2);
        int[] nonBoundary = new int[nonBoundaryCount];
        int index = 0;

        for (int i = 1; i < rows - 1; i++) 
        {
            for (int j = 1; j < cols - 1; j++) 
            {
                nonBoundary[index++] = array[i][j];
            }
        }

        
        
        for (int i = 0; i < nonBoundaryCount - 1; i++) 
        {
            for (int j = 0; j < nonBoundaryCount - i - 1; j++) 
            {
                if (nonBoundary[j] > nonBoundary[j + 1]) 
                {
                    
                    int temp = nonBoundary[j];
                    nonBoundary[j] = nonBoundary[j + 1];
                    nonBoundary[j + 1] = temp;
                }
            }
        }

        
        
        index = 0;
        for (int i = 1; i < rows - 1; i++) 
        {
            for (int j = 1; j < cols - 1; j++) 
            {
                array[i][j] = nonBoundary[index++];
            }
        }


        
        System.out.println("\nArray after sorting non-boundary elements :");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}