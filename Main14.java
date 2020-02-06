import java.util.*;

class Invoice
{
	String partNumber;
	String partDiscription;
	int itemPurchased;
	double pricePerItem;
	Invoice(String pn, String pd, int ip, double ppi)
	{
		partNumber = pn;
		partDiscription = pd;
		itemPurchased = ip;
		pricePerItem = ppi;
		
		if(ppi<0)
			pricePerItem = 0.0;
			
		if(ip<0)
			itemPurchased = 0;
	}
	
	public double getInvoiceAmount()
	{
		double amount = itemPurchased*pricePerItem;
		System.out.println("*************************\n");
		System.out.println("part number of item is "+partNumber);
		System.out.println("part discription of item is "+partDiscription);
		System.out.println("item purchased is "+itemPurchased);
		System.out.println("price per item "+pricePerItem);
		return amount;
	}
}

public class Main14
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter part number");
		String partNumber = s.next();
		
		System.out.println("enter part discription");
		String partDiscription = s.next();
		
		System.out.println("enter item purchased");
		int itemPurchased = s.nextInt();
		
		System.out.println("enter price per item");
		double pricePerItem = s.nextInt();
		
		Invoice obj=new Invoice(partNumber ,partDiscription ,itemPurchased ,pricePerItem);
		
		double amount = obj.getInvoiceAmount();
		System.out.println("total amount is "+amount);
	}
}	