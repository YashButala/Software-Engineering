public class ComputeInitial
{
        public static void main(String[] args)
        {
                String myname="Flint F. Fredstone";
                String myInitials=new String();
                int length=myname.length();
                for(int i=0;i<length;i++)
                {
                        if(Character.isUpperCase(myname.charAt(i)))
                                myInitials+=myname.charAt(i);
                }
                System.out.println("My intials are: "+myInitials);
        }
}
