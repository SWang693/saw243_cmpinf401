package saw243_lab5;
import java.util.Random;
import java.util.Scanner;
public class DiceRoll {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String userCont = "Yes";
		Random r = new Random();
		while(userCont == "Yes" || userCont == "yes") {
			System.out.println("How many time do you wanna roll");
			int rollingTimes = userInput.nextInt();
			rollDice(rollingTimes, r);
			System.out.println("Continue Yes or No:");
			userCont = userInput.nextLine();
		}
		userInput.close();
	}
	public static void rollDice(int rollTimes, Random value) {
		int roll1 = 0;
		int roll2 = 0;
		int[] myArray = new int[11];
		for(int i = 0; i < rollTimes; i++) {
			roll1 = value.nextInt(6) + 1;
			roll2 = value.nextInt(6) + 1;
			int sum = roll1 + roll2;
			myArray [sum-2] += 1;
		}
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(i + 2 + ": " + myArray[i] + " " + (double)myArray[i]/rollTimes);
		}
	}

}
