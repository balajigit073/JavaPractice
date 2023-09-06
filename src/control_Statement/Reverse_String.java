package control_Statement;

public class Reverse_String {

	public static void main(String[] args) 
	{
		String name="Balaji";
		String rev="";
		int leng=name.length();
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
		

	} 

}
