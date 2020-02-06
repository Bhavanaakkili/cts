import java.util.*;

public class Find23
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] temp=new int[n];
		int[] ar=new int[n];
		
		for(int i=0; i<n; i++)
			temp[i]=s.nextInt();
		
		for(int i=n-1,j=0; i>=0; i--,j++)
		{
			
			ar[i]=temp[j];
		}
		
		for(int i=0; i<n; i++)
			{
				System.out.println(ar[i]);
			}			
	}	

}	