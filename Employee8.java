
class Employee
{
	static int empCount=10;
	
	static public void increment()
	{
		empCount++;
		System.out.println(empCount);
	}
}

public class Employee8
{
	public static void main(String args[])
	{
		Employee e = new Employee();
		Employee.increment();
		e.increment();
		
	}
}