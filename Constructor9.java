import java.util.*;
class Employee
{
	Employee()
	{
		System.out.println("its a default constructor");
	}
	
	Employee(int empId, String empName)
	{
		System.out.println("*************\nEmployee name is "+empName+"\nEmployee id is "+empId);
	}
}

public class Constructor9
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter employee name and employee id");
		String eName = s.nextLine();
		//s.next();
		int id = s.nextInt();
		Employee e1 = new Employee();
		Employee e2 = new Employee(id,eName);
	}
}