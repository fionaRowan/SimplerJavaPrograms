package DiceGame;
import java.util.Scanner;

//********************************
//
//	Dice Game
//	Game Class
//
//	Fiona Rowan
//
//********************************

public class Game {
	boolean interactive; //set to true if mode 1
	boolean simulation; //set to true if mode 2
	Player p1; //human or smartComp (new strategy)
	Player2 p2;  //dumbComp (original strategy)

	//keep track of players' scores
	int p1Score = 0; 
	int p2Score = 0;

	//create dice
	Dice myDice = new Dice();

	//counter for simulation mode
	int i = 0;

	//new scanner for input
	Scanner input = new Scanner(System.in);

	public Game(int mode) {
		if(mode == 1) { 
			interactive = true; //mode 1 --> interactive
			p1 = new Player(0); // human
			p2 = new Player2(1); //dumbComp
		}
		else if(mode ==2){
			simulation = true; //mode 2 --> simulation
			p1 = new Player(1); //smartComp
			p2 = new Player2(1); //dumbComp
		}
	}


	public void play() {
		if (interactive){
			//human guess (over/under)
			int guess =0;

			//dumbComp's line
			int line;

			//sum of all eight die
			int sum;

			//intro message
			System.out.println("Ready to play?");//why is this repeating?

			//while loop that continues until someone wins
			while (p1Score <10 && p2Score <10){

				//roll the die 
				int p1Roll = myDice.rollFour(); //human roll
				int p2Roll = myDice.rollFour(); //dumbComp roll

				//sum of all eight die
				sum = p1Roll+p2Roll;

				//tell human what she rolled
				System.out.println("You Rolled " +p1Roll); 

				//dumbComp sets line
				line = p2.setLine();
				//tell human what dumbComp sets line to
				System.out.println("Computer sets line at " + line); 

				//human guesses over or under
				guess = p1.declareOverUnder();

				//tell human what sum was
				System.out.println("the sum was " +sum);
				if (guess < line && sum < line || guess>line && sum > line){
					//increase player 1's score if human was right
					p1Score++;
					//tell human she was right
					System.out.println("You were right!");
				}
				else{
					//if human was wrong, increase player 2's score
					p2Score++;
					//tell human she was wrong
					System.out.println("You were wrong!");
				}


			}

			if (p1Score > p2Score){
				//if human got 10 points, tell her she won and give individual scores
				System.out.println("You win! Your score is " + p1Score + " and the Comp got " +p2Score);
			}
			else if (p1Score<p2Score){
				//if dumbComp got 10 points tell human she lost and give individual scores
				System.out.println("Sorry! The computer won with " +p2Score+ " and you got " + p1Score);
			}

		}

		//if simulation mode
		else if (simulation){

			//player's points set to 0
			int p1Points=0;
			int p2Points=0;
			//int p2Score=0;
			//int p1Score=0;


			//player's lines
			int line1;
			int line2;

			//sum of eight die
			int sum;

			//simulate 100,000 games
			while (i < 100000){
				int p1Score =0;
				int p2Score = 0;

				//do until someone wins a round
				while (p1Score <10 && p2Score <10){

					//roll die
					int p1Roll = myDice.rollFour();
					int p2Roll = myDice.rollFour(); 

					//sum of die
					sum = p1Roll + p2Roll;

					//player 1 sets line with her strategy 
					line1 = p1.setLine(p1Roll);

					//player 2 sets line with her strategy
					line2 = p2.setLine();



					//if player 1 wins, increase her score by 1
					if ((line1>line2) && (sum>line2) || ((line1<line2) && (sum < line2)) || (line1==sum)){
						p1Score++;
					}


					else if ((line2>line1) && (sum>line1) || ((line2<line1) && (sum < line1)) || (line2==sum)){
						p2Score++;
					}
				}

				//if player 1 wins one round, increase her points by 1
				if (p1Score>p2Score){
					p1Points++;
				}

				//if player 2 wins one round, increase her points by 1
				else if (p1Score<p2Score){
					p2Points++;
				}

				//increase counter
				i++;

			}

			//if player 1 wins, tell human points and percentage of wins
			if (p1Points > p2Points){
				System.out.println("Player 1 (smartComp) won with " +p1Points + ". Player 2 (dumbComp) got "+p2Points);
				System.out.println("Player 1 wins " +(p1Points*100/(p1Points+p2Points))+ "% of the time.");
			}

			//if player 2 wins, tell human points and percentage of wins
			else if (p1Points < p2Points){
				System.out.println("Player 2 (dumbComp) won with " +p2Points + ". Player 1 (smartComp) got "+p1Points);
				System.out.println("Player 2 wins " +(p2Points*100/(p1Points+p2Points))+ "% of the time.");
			}
		}

		//goodbye message
		System.out.println("Thanks for Playing!");

	}

}



