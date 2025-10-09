import java.util.Scanner;

public class tower_of_han {

     
  

   public void shift (int inp,String a,String b,String c )
   {
       if (inp==1)
       {
          System.out.println("the disk is moved out \t " + a+"--->" +c);
       }


       else 
       {
            shift(inp -1 , a, c, b);
            System.out.println("moving disk\t " +a+"-->"+c);
            shift(inp -1, b, a, c);
       }
   }

     
    public static void main(String[] args) {
        
        tower_of_han ob = new tower_of_han();
        Scanner in = new Scanner(System.in);
        System.out.println(" enter the no of disk");
        int inp = in.nextInt();
        ob.shift(inp,"A", "B", "C");
    }
}
