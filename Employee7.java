import java.util.*;

class Employee
{
	int empId;
	
	public void setter(int id)
	{
		empId = id;
	}
	
	public int getter()
	{
		return empId;
	}
	
	public void print()
	{
		System.out.println("employee id is "+empId);
	}
}

class Employee7
{
	public static void main(String args[])
	{
		Employee e = new Employee();
		Scanner s = new Scanner(System.in);
		System.out.println("enter employee id");
		int id = s.nextInt();
		e.setter(id);
		System.out.println("employee id through getter method is "+ e.getter());
		e.print();
	}
}