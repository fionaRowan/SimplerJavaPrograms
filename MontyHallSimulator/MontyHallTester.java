package MontyHallSimulator;

import java.util.Scanner;

public class MontyHallTester {
	public static void main(String[] args) {
		MontyHallSimulator sim = new MontyHallSimulator();
		Scanner input = new Scanner(System.in);
		System.out.println("THE MONTY HALL SIMULATOR!");
		System.out.println("How many times would you like to simulate?");
		int n = input.nextInt();
		
		sim.simulate(n);
		System.out.println("Won by staying " +sim.getStayWins() + " out of " +n+ " trials!");
		System.out.println("Won by changing "+sim.getChangeWins() + " out of " + n + " trials!");
		
	}
}
