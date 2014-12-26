package DiceGame;

//********************************
//
//	Dice Game
//	Player2 Class 
//  dumbComp (given strategy)
//
//	Fiona Rowan
//
//********************************

public class Player2 {

	//one instance variable
	int line;

	//set boolean to true if dumbComp
	public static boolean dumbComp = false;
	public Player2(int i) {
		if (i==1)
			dumbComp = true;
		//setLine();
	}

	//dumbComp's strategy for setting the line
	public int setLine() {

		//choose random number between 24 and 33
		line = (int) (Math.random()*8+24);
		return line;
	}

}


