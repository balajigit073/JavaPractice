package constructor;

public class Constructor_00 
{
    String name;
    int emp_id;
    
    Constructor_00(String name,int emp_id)
    {
    	this.name=name;
    	this.emp_id=emp_id;
    }
	
	public static void main(String[] args) 
	{
		Constructor_00 emp1=new Constructor_00("Balaji",01);
		Constructor_00 emp2=new Constructor_00("Rathod",02);
		System.out.println(emp1.emp_id+" "+emp1.name);
		System.out.println(emp2.emp_id+" "+emp2.name);
	}

}
