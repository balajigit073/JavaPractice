package control_Statement;

public class Reverse_number_ForLoop 
{
          public static void main(String[] args)
          {
        	  //int no=1234;
        	  int rem=0, rev=0;
        	  for(int no=1234;no!=0;no=no/10)
        	  {
        		  rem=no%10;
        		  rev=rev*10+rem;
        	  }System.out.println(rev);
          }
}
