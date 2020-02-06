import java.util.*;

class Box
{
	int length, breadth, height;
	public void setter(int a, int b, int c)
	{
		length = a;
		breadth = b;
		height = c;
	}
	
	public int volume()
	{
		return (length * breadth * height);
	}
}

public class Volume5
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter length breadth height of cuboid : ");
		int l = s.nextInt();
		int br = s.nextInt();
		int h = s.nextInt();
		Box b = new Box();
		b.setter(l,br,h);
		System.out.println(b.volume());
	}
}