package rockPaperScissors.java;

import java.util.Scanner;
import java.util.Random;
public class rockPaperScissors {

	public static void main(String[] args) {
		
		int Rock = 0;
		int Paper = 1;
		int Scissors = 2;
		int uWeapon;
		int cWeapon;
		int compScore = 0;
		int userScore = 0;
				
						
		Scanner input = new Scanner ( System . in );
		Random random = new Random ();
		
		System.out.println("Do you want to play? Best 2 out of 3: y/n (lowercase please)");
		
		String Yes = input.nextLine();
		while(Yes.equals("y") && compScore < 2 && userScore < 2){
			
			System.out.println("Take your stand; 0. Rock, 1. Paper, 2. Scissors: (number only please) ");
			uWeapon = input.nextInt();
			cWeapon = random.nextInt(3);
			System.out.println(cWeapon);
		
			if(uWeapon == cWeapon){
				System.out.println("Bugger ... it's a tie ... this doesn't count ");
			}
		
			else if((uWeapon == Rock && cWeapon == Scissors) || (uWeapon == Paper && cWeapon == Rock) || (uWeapon == Scissors && cWeapon == Paper)){
				System.out.println("You win!!");
				userScore++;
			}
		
			else{
				System.out.println("I win!!");
				compScore++;
			}
		System.out.println("Your total score is " + userScore);
		System.out.println("My total score is " + compScore);
		}
		input.close();
	}

}
