import java.util.*;

public class Register {
   

    String stud [] ;
    int cap;
    int top; 

    Register (int max )
    {
         
         top = -1; 
         cap  = max;
         stud = new String[cap];

    }

    void  push (String n)
    {
        if (top+1 == cap)
        {
            System.out.println("overflow");
        }

        else 
        stud[++top] = n;
    }


     String pop ()
    {
       if (top == -1)
       {
          String dollar = "$$";
          return dollar;
       }

       else 
       {
           return stud[top--];
       }



    }



    void display()
    {
        if ( top == -1)
        {
            System.out.println("Stack is empty ");
        } 

        else 

        for ( int i =0 ; i<=top ; i++)
        {
            System.out.println(stud[i] + " "));
        }


    }



    public static void main(String[] args) {
          
         Scanner in = new Scanner(System.in);
         System.out.println("enter the capacity ");
         int cap_value = in.nextInt();
         Register ob = new Register(cap_value);

         while (true ) {
            
            System.out.println("1 . push name   \n 
                                2. pop name \n
                                3. display names \n
                                enter your choice ");
            
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:

                System.out.println("enter the name ");
                String n = in.nextLine();
                ob.push(n);
                break;

                case 2 :
               String name = ob.pop();
              if ( name.equals("$$"))
               System.out.println("stack underflow");
               else
               System.out.println("element pop out " + name );
                    break;

            case 3 :
               
            ob.display();
            break;

                
                    
            
                default:
                    break;
            }

             
         }
    }



    
}
