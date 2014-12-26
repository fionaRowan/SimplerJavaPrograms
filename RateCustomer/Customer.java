package customer;
/** 
 * Fiona Rowan 
 * fmr2112
 * 11/9/2013
 * CustomerRate
 * 
 * description:
 * this class has defines the Customer
 * datatype. 
 * 
 * 
 */
public class Customer implements Comparable<Customer>{
	private String customerName;
	private double amount; 
	
	public Customer(String n, double amt){
		customerName = n; 
		amount = amt; 
	}
	public String getName(){
		return customerName;
	}
	public double getAmount(){
		return amount; 
		
	}
	
	public String toString(){
		return customerName + " " + amount;
	}
	public int compareTo(Customer x){
		if (this.amount > x.getAmount())
			return 1; 
		else if (this.amount<x.getAmount())
			return -1; 
		else 
			return 0;
	}
}
