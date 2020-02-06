public class Continue
{
	public static void main(String args[])
		{
			int x=35;
			for(int i=0; i<x; i++)
			{
				if(i==10)
					break;
				if(i==5)
					continue;
				System.out.println(i);
			}
		}
}