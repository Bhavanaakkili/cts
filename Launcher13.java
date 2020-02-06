import java.util.*;

class Lamp
{
	boolean state;
	public void light(boolean s)
	{
		state = s;
		if(state)
		System.out.println("\nlight is on\n");
		else 
		System.out.println("\nlight is off\n");
	}
}

public class Launcher13
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		Lamp lamp = new Lamp();
		while(true)
		{
			System.out.println("enter 1 to turn on light\nenter 2 to turn off light\nenter 3 to quit");
			int choise = s.nextInt();
			
			if(choise == 1)
				lamp.light(true);
			else if(choise == 2)
				lamp.light(false);
			else if(choise==3)
				break;
			else
				System.out.println("enter right choise\n");
		}
			
	}
}