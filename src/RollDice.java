import java.util.Random;
import java.util.Scanner;


public class RollDice {

	public static void main(String[] args) {
		
		
		System.out.println();
		//Create Scanner
		Scanner input = new Scanner(System.in);
		String  choice = "y";
			
		
		//While loop
		
		while (choice.equalsIgnoreCase("y")){
		
			
		//User prompt
		System.out.println("Welcome to the Grand Circus Casino! Roll the dice? (y/n): ");
		input.nextLine();
		System.out.println("Roll 1:");
		
		//Create Random 
		Random diceRoll = new Random(0);
		int roll1 = diceRoll.nextInt(100);
		int roll2 = diceRoll.nextInt(100);
		
		//for loop
		for (int count = 1; count <= 10; count++);
		System.out.println(roll1);
		System.out.println(roll2);
		
		//Continue prompt
		System.out.println("Roll again?(y/n)");
		input.nextLine();
		choice = input.next();
		
		//Thank you message
		System.out.println("Thanks for gambling!");
		
		}
	}





}
