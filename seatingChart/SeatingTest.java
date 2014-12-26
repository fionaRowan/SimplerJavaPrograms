package seatingChart;
/** 
 * Fiona Rowan 
 * fmr2112
 * 11/9/2013
 * SeatingTest Class
 * 
 * description:
 * this class runs the program that
 * allows a buyer to purchase tickets for 
 * theater seats.
 * 
 */

public class SeatingTest {
	public static void main(String[] args){
		System.out.println("Welcome to the box office!");
		
		//array of seating prices 
		int [][] prices = new int[][]{
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
				{20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
				{20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
				{30, 40, 50, 50, 50, 50, 50, 50, 40, 30},
		};
		
		//create new seatChart object and pass in the prices
		SeatChart x = new SeatChart(prices); 
		
		//call the buy method on the seatChart object
		x.buy(); 
		
	}
}
