import java.util.Scanner;

import java.util.Arrays;

class Hangman{
	String[] words = {"industrial", "mechanical", "computer", "civil", "electronics", "electrical", "chemical", "marine", "management", "aerospace"};
	int numOfMisses = 0;
	
	public String wordChooser(String[] words) {
		return words[(int)(Math.random()*10)];
	}
	
	public boolean checkIfLetterMatches(Hangman game, char input, char[] charToCompare, int index) {
		boolean match;
		if (charToCompare[index] == input) {
				 match = true;
			}
			else{
				 match = false;
			}

		return match; 
	}
}

public class HangmanGame {

	public static char[] renewAsteriskDisplay(Hangman game, int limit, char[] charToCompare, char input, char[] asteriskDisplay) {
		int i = 0;
		while (i < limit) {
			boolean match = game.checkIfLetterMatches(game, input, charToCompare, i);
			if (match) {
				asteriskDisplay[i] = input;
			}
			
			i++;
		}
		return asteriskDisplay;
	}
	
	public static boolean checkIfInputWasRepeated(char input,char[] oldInputs, int j) {
		boolean notUnique = false;
		for(int i = 0; i < j; i++) {
			if (oldInputs[i] == input) {
				notUnique = true;
				break;
			}
		}
		return notUnique;
	}
	
	public static char[] convertWordFromStringToChar(String wordChosen) {
		char[] characters = new char[wordChosen.length()];
		for (int i = 0; i < wordChosen.length(); i++) {
			characters[i] = wordChosen.charAt(i);
		}
		return characters;
	}
	
	public static char[] convertWordToAsterisk(int limit) {
		char[] asterisk = new char[limit];
		for (int i = 0; i < limit; i++) {
			asterisk[i] = '*';
		}
		
		return asterisk;
	}
	
	public static void main(String[] args) {
		Hangman game = new Hangman();
		Scanner inp = new Scanner(System.in);
		
		char userChoice = 'y';
		
		while(userChoice == 'y') {
			boolean wordComplete = false;
			game.numOfMisses = 0;
			String wordChosen = game.wordChooser(game.words);
			int limit = wordChosen.length();
//			System.out.println(wordChosen);
		
			char[] charToCompare = convertWordFromStringToChar(wordChosen);
			char[] asteriskDisplay = convertWordToAsterisk(limit); 
			char[] input = new char[99];
			int j = 0;
			System.out.print("\n");
			while(wordComplete != true) {
				System.out.print("(Guess) Enter a letter in word ");
				
				System.out.print(asteriskDisplay);
				
				System.out.print(" > ");
				
				input [j] = inp.next().toLowerCase().charAt(0);
				
				boolean isNotUnique = checkIfInputWasRepeated(input[j], input, j);
				if (isNotUnique == true) {
					System.out.println(input[j] + " is already in the word ");
				}
				else {
					boolean match = false;	
					for (int i = 0; i < limit; i++) {
						match = game.checkIfLetterMatches(game, input[j], charToCompare, i);
						if (match == true) {
							break;
						}
					}
					
					if (match == false) {	
						System.out.println(input[j] + " is not in the word ");
						input[j] = '0';
						game.numOfMisses++;
					}
					
					
					
					asteriskDisplay = renewAsteriskDisplay(game, limit, charToCompare, input[j], asteriskDisplay);
					j++;
				}
				if (Arrays.equals(charToCompare, asteriskDisplay)) {
					wordComplete = true;
				}
			}
			System.out.print("The word is " + wordChosen + ". You missed " + game.numOfMisses + " times\n");
			System.out.print("Do you want to guess another word? Enter y or n> ");
			userChoice = inp.next().toLowerCase().charAt(0);
			if (userChoice == 'n') {
				break;
			}			
		}
		inp.close();
	}
}
