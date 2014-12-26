package customer;

/** 
 * Fiona Rowan 
 * fmr2112
 * 11/9/2013
 * CustomerRate
 * 
 * description:
 * this program rates customers adds, sorts, and rates 
 * customers in an array list. 
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; 
public class Store {
	ArrayList<Customer> customerList; 
	public Store(){
		customerList = new ArrayList<Customer>();
		
	}
	
	public void rate(){
		int reply = 3;
		System.out.println("RATE YOUR CUSTOMER!");
		while (reply !=0) {
			System.out.println("Would you like to 1, add customers, or " +
					"2 print out a list of rated customer, "+
					"and best customer? " +
					"or 0 to quit" );
			Scanner in = new Scanner(System.in);
			reply = in.nextInt();
			if (reply==1)
				addSale();
			else
				printCustomers(); 
				bestCustomer();
		}
	}
	
	public void addSale(){
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the customer's name!");
		String name = in.next();
		System.out.println("Enter the value of his/her purchase!");
		double amount = in.nextDouble(); 
		Customer newCustomer = new Customer (name, amount);
		customerList.add(newCustomer);
		System.out.println(name+ " added");
	}
	
	public void printCustomers(){
		Collections.sort(customerList);
		System.out.println("worst customer \n" +
				"~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (Customer c: customerList){
			System.out.println(c.toString());
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~ \n"+
				"best customer");
		System.out.println();

	}
	public void bestCustomer(){
		int i = customerList.size()-1;
		Customer bestCustomer = customerList.get(i);
		String best = "Best customer: /" + bestCustomer;
		System.out.println(best);
	}
}
