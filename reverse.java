public class reverse {

    public static void main (String args[])
    {
        String name = " arnav ";
        System.out.println("original string is "+name );

        reverse ob = new reverse();

        System.out.println(" the revese string is "+ ob.rev(name));
    }


     String rev ( String name )
     {
        if ( name == null || name.length()<= 1)
        {
            return name ;
        }

        return rev(name.substring(1)) + name.charAt(0);
     }
}
