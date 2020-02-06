public class Mainavg
{
	public static void main(String args[])
	{
		Avg o=new Avg();
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		o.avg(a,b,c);
	}
		
}

class Avg
{
 	public void avg(int a, int b, int c)
		{
		float average=(float)(a+b+c)/3;
		System.out.println(average);
		}
}	 