import java.util.Scanner;

public class CardGame{

 int cards [];
 int cap ;
 int  top;
 CardGame(int cc)
 {
    cap  =  cc;
    top = -1;
    cards = new int[cap];
 }

 void addCard(int v )
 {
    if (top+1 ==cap)
    {
      System.out.println("Card pile is full");
    }

    else
    {
        cards[++top]= v;
    }
 }

  int drawCard ()
  {
     if (top == -1)
     {
        return -9999;
     }
     else   
     {
         return cards[top--];
     }

  }

    void display()
   {
       if (top== -1)
       {
          System.out.println("Card pile is empty ");
       } 

       else
       {
          for (int i = top ; i>=0;i--)
          {
             System.out.println(cards[i]);
          }
       }
       }
;
       public static void main(String[] args) {
           int cc;

          Scanner in = new Scanner(System.in);
           System.out.println("enter your capcity ");

          cc = in.nextInt();
          CardGame ob = new CardGame(cc);  

          while (true) {

            System.out.println("1.add card\n2.Draw card\n3Display\n4exit");
            System.out.println("enter your choice ");
            int choice = in.nextInt();
             switch (choice) {

                case 1:
                System.out.println("enter te card value ");
                int v = in.nextInt();
                ob.addCard(v);
                break;

                case 2:
                int d = ob.drawCard();

                  if (d == -9999)
                  {
                     System.out.println("sorry its empty ");
                  }

                  else
                  {
                    System.out.println("the card drawn out  " + d);
                  }

                  case 3 :
                  ob.display();
                  break;

                case 4:

                System.exit(0);
                break;             
                default:
                    break;
             }
          }

          

         
          

       }
   }

 


