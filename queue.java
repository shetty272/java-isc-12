import java.util.Scanner;

public class queue {

    int dat[];
    int front;
    int  rear;
    int cap;

    queue(int max)
    {
       cap = max;
       front=rear=0;
       dat = new int[cap];
    }


    void add_dat(int v)
    {
        if (cap>rear)
        {
            dat[rear]=v;
            rear++;

        }

        else
        {
            System.out.println("Queue full");
        }
    }

    int pop_dat()
    {
        if (front==rear) 
        {
            System.out.println("underflow");
            return-999;
        }

        else
        {
            return dat[front++];
        }
    }


    void display () 
    {
         if (front==rear) 
         {
            System.out.println("queue empty ");
         } 

         System.out.println(" elements from front to rear");
         for(int i  = front;i<rear;i++)
         {
             System.out.print(dat[i] + " ");
         }
       
         System.out.println();

        
    }

    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter the queue capacity or size ");

        int max = in.nextInt();
        queue ob = new queue(max);


        while (true) 
        {
                       System.out.println("1.add element \n2.Delete element\n3.display queue \n4.exit ");

                       int choice = in.nextInt();

                       switch (choice) {
                        case 1:
                             System.out.println("enter the element ");
                             int v = in.nextInt();
                             ob.add_dat(v);
                             break;

                         case 2 :
                         int fun = ob.pop_dat();

                         if ( fun!=-999)
                         {
                             System.out.println("element deleted ");
                         }

                         break;

                        case 3:

                        ob.display();
                        break;

                        case 4:
                         System.out.println("bye pls give marks ");
                        System.exit(0);
                       
                        default:
                            break;
                       }
        }
    }
}
