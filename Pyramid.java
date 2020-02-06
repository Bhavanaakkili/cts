public class Pyramid
{
	public static void main(String args[])
		{
			int x=Integer.parseInt(args[0]);
			for(int i=1; i<=x; i++)
			{
				int space=x-i;
				for(int k=1; k<=space; k++)
					System.out.print(" ");
				for(int j=i; j>0; j--)
					{
						System.out.print(i);
						System.out.print(" ");
					}
				System.out.println();
			}
		}
}