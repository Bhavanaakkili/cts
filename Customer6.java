import java.util.*;
class Customer
{
	int custId;
	String custName;
	public void setter(int id, String name)
	{
		custId = id;
		custName = name;
	}
	
	public void print()
	{
		System.out.println("Customer id is : "+custId+"\nCustomer name is : "+custName);
	}
}

 public class Customer6
{
	public static void main(String args[])
	{
		Customer c = new Customer();
		Scanner s = new Scanner(System.in);
		System.out.println("enter customer id and customer name");
		int id = s.nextInt();
		s.nextLine();
		String name = s.nextLine();
		c.setter(id,name);
		c.print();
	}
}