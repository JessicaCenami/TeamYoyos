//Scanner imported in case I decide I want it
import java.util.Scanner;
//Class Name
public class Group_Project {
	//Makes stuff work 
	public static void main(String[] args) {
		//Test to see if Eclipse is working
		System.out.println("Hello Group");
		System.out.println("Today we are going to mix some colors.");
		System.out.println("We will mix blue and orange and we should get a neutral color.");
		System.out.println("We will only get a neutral color if the sum of the blue and orange are equal to 25.");
		System.out.println("We will be using random integers to accomplish this\n\n");
		//Declare Variables
		double blue=Math.random()*(50-0)+0;
		int orange=2; 
		boolean neutral = true;
		//write some code
		if (blue+orange == 25)
System.out.println("The answer is 25 meaning that "
		+ "blue and orange make a neutral color." );
		else if (blue+orange <10)
			System.out.println("You knocked the colors off the table. "
					+ "The experiment is ruined. Why have you done this?");
		else if (blue+orange >=26)
			System.out.println("You've mixed the colors too much. Your older sibling has snitched on you. "
					+ "We do not have a neutral color.");
else 
	System.out.println("This experiment has failed. Try again next time, champ");
		

		
		

	
	
	
}
	}


