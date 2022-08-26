package dice;

import java.util.Random;

public class DiceRoller {
	private int firstDie;
	private int secondDie;
	private int[] sums;
	
	public DiceRoller() {
		firstDie = 1;
		secondDie = 1;
		sums = new int[11];
		
	}
	
	public void rollDice() {
		Random rand = new Random();
		firstDie = rand.nextInt(6) + 1;
		secondDie = rand.nextInt(6) + 1;
	}
	
	public void sumDice() {
		int sum = 0;
		for(int i=1; i<=36000000; i++) {
			rollDice();
			sum = firstDie + secondDie;
			sums[sum-2]+=1;
			
		}
	}
	
	public void displayResults() {
		sumDice();
		System.out.println("Sum of Dice\t" + "Occurences");
		for(int i=0; i<sums.length; i++) {
			System.out.printf("%11d\t", (i+2));
			System.out.printf("%10d\t", sums[i]);
			System.out.println();
		}
	}

}
