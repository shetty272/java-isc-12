 import java.util.Scanner;
 
 class Node {


    int data ;
    Node link;
    

    Node ( int t )
    {
         data = t;
         link = null; 
    }
   

}

public class Linklist 
{
     Node head ;

    
       void insertbeg (int t )
       {
          Node n = new Node(t);
          
          if(head==null)
          {
               head=n;

          }

          else 
          {
               n.link = head;
               head=n;
          }

       }

       void insertmid (int t, int z )
       {
          Node n = new Node(t);

          if (head == null)
          {
               head = n; 

          }

          else 
          {
               Node current = head;

               while (current.link != null) {

                    if (current.data == z )
                    {
                         n.link = current.link;
                         current.link = n;
                    }
                    
                   current= current.link;
               }
          }
       }

       void insertend(int t )
       {
            Node n = new Node(t);
            if ( head == null )
            {
               head = n ; 
            }
            else 
            {
               Node current = head ;

            

            while (current.link != null) {
                
               current = current.link; 
            }
             current.link = n;
          }
             

       }
     
       boolean  search (int t)
     {
            Node current  = head; 

            if (head == null)
            {
               return false;
            }

            else
            {  
             
                while (current != null) 
            {
                    
                      if ( current.data== t)
                      {
                          return true;
                      }

                      current= current.link;


                 }

                 return false;

            }

        
            

     }
        public void deletenode (int t)
        {
               if (head==null)
               {
                    System.out.println("The  linklist  is empty ");
               }

               if (head.data==t)
               {
                   head=head.link;
                   System.out.println("node" +  t + "deleted form thhe begining");
               }
                 Node current = head;
                 Node prev = null;

               while (current!=null&& current.data!=t)
               {
                    prev = current;
                    current= current.link;
               }


               if (current== null)
               {
                    System.out.println("sorry node "+t+" was not found  ");
               }

             prev.link =current.link;

             System.out.println("node "+t+"is gone ");
                    
     
        }


          void display ()
        {
           if (head==null)
           {
                System.out.println("The  linklist  is empty ");
           }

           else  
           {
               Node current = head;   // current traverse through thhe linklist 
               
               while (current!=null) 
               {
                    System.out.print  (current.data+ "  ");
                    current =  current.link;  

               }

               System.out.println();


           }

          
        }

     

      
   public static void main(String[] args) {
     
        Linklist ob = new Linklist();

        Scanner in =  new Scanner(System.in);
        int choice,t;
        
        while (true) 
        {
             
          System.out.println("1.Insert node at the beginning \n2.Insert node at a specified position \n3. Insert node at the end\n4.display\n5.search\n6.delete node\n7.exit");
          System.out.println("enter your  choice ");
          choice = in.nextInt();

           switch (choice) {
               case 1:
                    
                    System.out.println("pls enter your value");
                    t  = in.nextInt();
                    ob.insertbeg(t);
                    break;
               
               case 2 :

               System.out.println("enter your  value ");
               t = in.nextInt();
               System.out.println("enter the data aafter  which a new node hhas to searched ");
               int z = in.nextInt();
               ob.insertmid(t,z);
               break;

               case 3 :

               System.out.println("enter the data to be inserted");
               t = in.nextInt();
               ob.insertend(t);
               break;





               case 4:
               
                ob.display();
                break;


                case 5:
               
               System.out.println("pls enter a value to search");
                t = in.nextInt();
                if (ob.search(t))
                {
                    System.out.println(t +" is found ");
                }

                else
                {
                    System.out.println( t+"is not found ");
                }

                   break;


                   case 6:
                   System.out.println("enter the node to be deleted ");
                   t = in.nextInt();
                   ob.deletenode(t);
                   break;





                case 7:
                System.out.println("nothing too see ");
                System.exit(0);



               

           
               default:
                  
                System.out.println("invalid choice ");
                    
           }
        }
   }
}
     






