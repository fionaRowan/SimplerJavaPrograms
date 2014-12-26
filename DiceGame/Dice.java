

//********************************
//
//	Dice Game
//	Dice Class
//
//	Fiona Rowan
//
//********************************

public class Dice{
	private int n;
	private int side;

	//roll 6-sided dice
	public Dice(){
		n=6;
		roll();
	}

	//roll n-sided dice
	public void roll(){
		side = (int) (Math.random() * n + 1);
	}


	//roll four 6-sided die
	public int rollFour(){
		side = (int) (Math.random()*20+4);
		return side;
	}

	//return the side of dice
	public int getSide(){
		return side;
	}
}
