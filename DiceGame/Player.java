package DiceGame;
import java.util.Scanner;

//********************************
//
//	Dice Game
//	Player Class
//	(human and smartComp)
//
//	Fiona Rowan
//
//********************************

public class Player {
	Scanner input = new Scanner(System.in);

	//instance variables
	int line;
	int declaration;

	//if interactive, set human to true. otherwise, set smartComp to true.
	public static boolean human = false, smartComp = false;
	public Player(int i) {
		if (i == 0)  {
			human = true;
		}
		else if (i==1){
			smartComp = true;
		}
	}

	public int setLine(int x) {
		if (smartComp) {
			//smartComp strategy for setting line
			line = x+ (int)(Math.random()*5+12); 
		}
		return line;
	}

	public int declareOverUnder(){
		if (human){

			//ask human whether she thinks sum is over or under dumbComp's line
			System.out.println("What do you think? 1-Over, 0-Under");

			int guess = input.nextInt();

			//if over, set declaration to be higher than any possible outcome
			if (guess == 1){
				declaration = 49;
			}

			//if under, set declaration to be lower than any possible outcome
			else if (guess ==0)
				declaration = 0;
		}
		return declaration; 
	}


}
