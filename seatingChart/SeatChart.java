package seatingChart;
/** 
 * Fiona Rowan 
 * fmr2112
 * 11/9/2013
 * SeatChart class
 * 
 * description:
 * this class is for the creation of the 
 * SeatChart object for the SeatingTest program. 
 * 
 * 
 */

import java.util.Scanner;

public class SeatChart {
	Scanner input = new Scanner(System.in);
	Seat[][] seatingChart;
	public int ROWS; 
	public int COLUMNS;
	
	//create new array that has a parameter of an array of prices
	public Seat[][] resetChart(int [][]prices){
		
		//the length of rows and columns determined by the array of prices.
		ROWS = prices.length;
		COLUMNS = prices[0].length;
		seatingChart = new Seat[ROWS][COLUMNS];
		for (int i=0; i<ROWS; i++){
			for (int j = 0; j<COLUMNS; j++){
				seatingChart[i][j] = new Seat(prices[i][j]);
			}
		}
		return seatingChart;
	}

	//constructor passes the array parameter into resetChart() method. 
	public SeatChart(int [][]prices){
		resetChart(prices);
	}

	//calling this method on a seatChart object allows user to buy seats.
	public void buy(){
		boolean byPrice=false;
		int mode;
		int again = 1;

		while (again == 1){
			System.out.println("1-purchase by position. 2- purchase by price.");
			
			//mode determines how the user wants to buy seat(s). 
			mode = input.nextInt();
			if (mode == 2){
				byPrice = true;
			}
			else{
				byPrice = false;
			}
			printChart();
			
			//this boolean determines if the seat is valid.
			boolean valid = false; 
			
			//integers indicating the seat row and column
			int pos1=0;
			int pos2=0; 
			
			//what kind of seat the user wants to buy
			Seat cost;
			
			//while the user wants to buy a seat by its position
			//determine that it is a valid seat.
			while (valid == false && !byPrice){
				System.out.println();
				System.out.println("Enter seat position (example: 1 0)");
				pos1 = input.nextInt();
				pos2 = input.nextInt(); 
				if (isSeat(pos1, pos2)){
					valid =true;
				}
			}
			
			//while the user wants to buy a seat by its price,
			//determine that the seat is valid.
			while (valid ==false && byPrice){
				System.out.println();
				System.out.println("Enter an available price.");
				cost = new Seat(input.nextInt()); 
				pos1=getSeatRow(cost);
				pos2=getSeatColumn(cost);
				if (isSeat(pos1, pos2)){
					valid =true;
				} 
			}
			
			//buy the seat indicated by user.
			buy(pos1, pos2);
			System.out.println("You bought seat " + pos1 + " " +pos2);
			
			//indicate whether user wants to buy another seat.
			int answer = purchaseAnother(); 
			if((noSeats()) || (answer==0)){
				again = 0;
				System.out.println("Thanks for buying with us!");
			}
		}
	}
	
	//prints seats in tabular form.
	private void printChart(){
		for (int i=0; i<ROWS; i++){
			System.out.println();
			for (int j = 0; j<COLUMNS; j++){
				Seat a = seatingChart[i][j];
				System.out.printf("%8d", a.getPrice());
			}
		}
	}
	
	//method determines if the formal explicit parameters indicate a valid seat.
	private boolean isSeat(int pos1, int pos2){
		Seat b = new Seat(0);
		Seat a;
		boolean valid = false;
		
		//check that explicit parameters do not surpass dimensions of array.
		if (pos1>=0 && pos1 < ROWS && pos2>=0 && pos2<COLUMNS){
			a = seatingChart[pos1][pos2];
			
			//check that the price of seat indicated by explicit parameters
			//is present in the theater and is not 0.
			for (int i = 0; i<ROWS; i++){
				for (int j=0; j<COLUMNS; j++ ){
					Seat c = seatingChart[i][j];
					if (a.equals(c))
						valid = true;
					if (a.equals(b)){
						valid = false;
					}
				}
			}

		}
		return valid;
	}

	//change the price of the seat that is bought to 0.
	public void buy(int pos1, int pos2){
		Seat a = seatingChart[pos1][pos2];
		a.changePrice(0);
	}
	
	//make sure that there are seats left in the theater to buy.
	public boolean noSeats(){
		int count = 0; 
		Seat b = new Seat(0);
		int i;
		int j;
		for (i =0; i<ROWS; i++){
			for (j = 0; j<COLUMNS; j++){
				Seat a = seatingChart[i][j];
				if (a.equals(b)){
					count++;
				}
			}
		}
		if (count == ROWS*COLUMNS)
			return true; 
		else
			return false; 
	}
	
	//ask user if he/she wants to buy another seat.
	public int purchaseAnother(){
		int answer = 0;
		System.out.println("Would you like to purchase a seat? 0-N, 1-Y");
		answer = input.nextInt(); 
		return answer;
	}
	
	//get the row index of the seat user wants to buy.
	public int getSeatRow(Seat cost){
		int pos1 =0;
		for (int i = 0; i < ROWS; i++){
			for (int j = 0; j < COLUMNS; j++){
				Seat a = seatingChart[i][j];
				if (a.equals(cost)){
					pos1 = i; 
				}
			}
		}
		return pos1;
	}
	
	//get the corresponding column index of the seat.
	public int getSeatColumn(Seat cost){
		int pos2 =0;
		for (int i = 0; i < ROWS; i++){
			for (int j = 0; j < COLUMNS; j++){
				Seat a = seatingChart[i][j];
				if (a.equals(cost)){
					pos2 = j; 
				}
			}
		}
		return pos2;
	}
}




