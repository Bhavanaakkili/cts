import java.util.Scanner;

public class Arr {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int count=0;
		
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					arrange(j,a);
					count++;
				}
			}
		}
		n=a.length-count;
		for(int i=0;i<n;i++)
			System.out.println(a[i]);

		for(int i: a)
			System.out.println(i);
	}
	
	static void arrange(int pos, int a[])
	{
		for(int i=pos; i<a.length-1; i++)
			a[i]=a[i+1];
	}
}
