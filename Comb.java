public class Comb
{
public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int num;
		
		for(int i=0;i<3;i++)
		{
			num=a*100;
			num=num+(b*10);
			num=num+(c);
			System.out.println(num);
			int temp;
			temp=a;
			a=b;
			b=c;
			c=temp;
		}
		
		a=Integer.parseInt(args[2]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[0]);
		for(int i=0;i<3;i++)
		{
			num=a*100;
			num=num+(b*10);
			num=num+(c);
			System.out.println(num);
			int temp;
			temp=a;
			a=b;
			b=c;
			c=temp;
		}
	}
}