import java.util.Scanner;

public class stringop {


  String str;
  String nstr;
  String msk ;
  Scanner sc = new Scanner(System.in);
  stringop()
  {
       str = "";
       nstr = "";
       msk = "";
  }

   public void accept ()
   {
        System.out.println("pls enter your string");
        str=sc.next()+sc.nextLine();
   }
    
}
