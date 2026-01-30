package cgcccsc110.jellybeangame;

import java.util.Scanner;
import java.util.Random;

public class JellyBeanGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int numberOfJellyBeans = random.nextInt(1000) + 1, guessOfNumberOfJellyBeans, countOfGuesses = 0;
		String yesOrNo;
		do {
			System.out.println("There Are 1-1000 JellyBeans In The Jar. How Many JellyBeans Are In The Jar?");
			// System.out.println("There Are " + numberOfJellyBeans + " JellyBeans In The Jar");
			guessOfNumberOfJellyBeans = scanner.nextInt();
			if (guessOfNumberOfJellyBeans < numberOfJellyBeans) {
				countOfGuesses++;
				System.out.println("Too Low!");
			}
			else if (guessOfNumberOfJellyBeans > numberOfJellyBeans) {
				countOfGuesses++;
				System.out.println("Too High!");
			}
			else {
				countOfGuesses++;
				if (countOfGuesses == 1) {
					System.out.println("High Five! You Got It In " + countOfGuesses + " Guess! Play Again?");
				}
				else {
					System.out.println("High Five! You Got It In " + countOfGuesses + " Guesses! Play Again?");
				}
				yesOrNo = scanner.nextLine();
				if (!(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("No"))) {
					do {
						System.out.println("Yes Or No?");
						yesOrNo = scanner.nextLine();
					} while (!(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("No")));
				}
				if (yesOrNo.equalsIgnoreCase("Yes")) {
					numberOfJellyBeans = random.nextInt(1000) + 1;
					if (numberOfJellyBeans == guessOfNumberOfJellyBeans) {
						do {
							numberOfJellyBeans = random.nextInt(1000) + 1;
						} while (numberOfJellyBeans == guessOfNumberOfJellyBeans);
					}
					countOfGuesses = 0;
					continue;
				}
				else {
					System.out.println("Fun Playing With You! Have A Nice Day!");
					scanner.close();
					break;
				}
			}
		} while (guessOfNumberOfJellyBeans != numberOfJellyBeans);
	}
	
}
