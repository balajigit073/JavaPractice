package control_Statement;

public class Fibonacci_Series {

	public static void main(String[] args) 
	{
		int a=0,b=1;
		System.out.println(a+b);
		int c,i;
		for(i=1;i<=10;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
		

	}

}
