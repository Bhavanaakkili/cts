import java.util.*;

public class Aravg
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int[] ar=new int[3];
		int sum=0;

		for(int i=0; i<3; i++)
			ar[i]=s.nextInt();
		
		for(int i=0; i<3; i++)
			sum+=ar[i];
		
		float avg=(float)sum/3;
		System.out.println(avg);
	}
}	