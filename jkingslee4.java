import java.util.Scanner;

public class Menu{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Choose and option:");
		System.out.println("1. Sandwich");
		System.out.println("2. Cake");
		System.out.println("3. Soda");
		System.out.println("4. Juice");

		int select = input.nextInt();

		switch(select)
		{
			case 1: System.out.println("You chooose sandwich");
				break;
			case 2: System.out.println("You choose cake");
				break;
			case 3: System.out.println("You choose soda");
				break;
			case 4: System.out.println("You choose juice");
				break;
			default: System.out.println("Invalid selection");
		}
	}
}
