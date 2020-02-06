import java.util.*;

 class Dog
{
	int drinkTime;
	public  void setDrinkTime(int time)
	{
		drinkTime = time;
	}
	
	public int getDrinkTime()
	{
		return drinkTime;
	}
	
	public void needsToGo()
	{
		if(drinkTime > 4)
		System.out.println("Dog is ready to waLK");
		else
		System.out.println("let the dog to sleep");
	}
}

public class DogOwner12
{
	public  static void main(String args[])
	{
		Dog d = new Dog();
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.println("how much time ago dog drink water");
			int time = s.nextInt();
			d.setDrinkTime(time);
			int t = d.getDrinkTime();
			System.out.println("drinking time is "+t+" hours");
			d.needsToGo();
			System.out.println("press 1 to continue and press 2 to quit");
			int choise = s.nextInt();
 			if(choise == 1)
			continue;
			else
			break;
		}
		
	}
}