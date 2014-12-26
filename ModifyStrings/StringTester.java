package stringModifier;

import java.util.Scanner;

public class StringTester {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a string!!");
		String stringThing = input.nextLine();
		System.out.println("What should I print?");
		System.out.println("1- getUppercaseLetters");
		System.out.println("2- everySecondLetter");
		System.out.println("3- replaceVowelsWithUnderscores");
		System.out.println("4- numberOfVowels");
		System.out.println("5- positionOfVowels");
		int choice = input.nextInt();
		
		if (choice == 1){
			System.out.println(StringFunctions.getUppercaseLetters(stringThing));
		}
		
		else if (choice == 2){
			System.out.println(StringFunctions.everySecondLetter(stringThing));
		}
		else if (choice == 3){
			System.out.println(StringFunctions.replaceVowelsWithUnderscores(stringThing));
		}
		else if (choice == 4){
			System.out.println(StringFunctions.numberOfVowels(stringThing));
		}
		else {
			System.out.println(StringFunctions.positionsOfVowels(stringThing));
		}
	}
}
