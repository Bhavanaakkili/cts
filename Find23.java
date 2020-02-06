import java.util.*;

public class Find23
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] ar=new int[n];
		int pos=0;

		for(int i=0; i<n; i++)
			ar[i]=s.nextInt();
		
		System.out.println("enter the element to find");
		int find=s.nextInt();

		for(int i=0; i<n; i++)
		{
			if(find==ar[i])
			{
				pos=i;
				break;
			}
			else
				pos=-1;
		}

		if(pos==-1)
			System.out.println("element not find");
		else
			System.out.println("element find at "+pos);
	}
}	