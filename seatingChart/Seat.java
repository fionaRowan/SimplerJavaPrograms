

/** 
 * Fiona Rowan 
 * 11/9/2013
 * Seat class
 * 
 * description:
 * this class is for the creation of the 
 * Seat object for the SeatingTest program. 
 * 
 * 
 */

public class Seat {
	int price; 
	public Seat(int i){
		price = i;
	}
	
	//returns price.
	public int getPrice(){
		return price;
	}
	
	//changes the price of a seat to the explicit parameter. 
	public void changePrice(int i){
		price = i;
	}
	
	//checks if prices of two seats are equal.
	public boolean equals(Object otherObject){
		Seat other = (Seat) otherObject; 
		return price == other.price;
	}
	
}
