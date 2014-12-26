
import java.util.Random;

public class MontyHallSimulator {
	public int change;
	public int stay;
	public MontyHallSimulator(){
	change = 0;
	stay = 0;
	}
	public void simulate(int n){
		Random gen = new Random(); 
		for (int i = 0; i<n; i++){
			int playerPick = gen.nextInt(3)+1;
			int car = gen.nextInt(3)+1;
			if (playerPick == car){
				stay++;
			}
		}
		for (int i = 0; i<n; i++){
			int playerPick = gen.nextInt(3)+1;
			int car = gen.nextInt(3)+1;
			int hostReveals = gen.nextInt(3)+1;
			while (hostReveals == car || hostReveals == playerPick){
				hostReveals = gen.nextInt(3)+1; 
			}
			if (playerPick != car){
				change++;
			}
		}
		
	}
	public int getStayWins() {
		return stay;
	}
	public int getChangeWins() {
		return change;
	}
}
