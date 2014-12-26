

import java.util.Scanner;
public class Trial {
	public static void main(String[] args)
	{
		String answer = "Y";
		do{
			//get hours worked per week from user
			Scanner input = new Scanner(System.in);
			System.out.println("Hello! Are you making more than one calculation? Y/N");
			answer = input.nextLine();
			System.out.println("How many hours do you work per week?");
			double hours = input.nextDouble();
			
			//get hourly pay from user
			System.out.println("What is your hourly payrate?");
			double payrate = input.nextDouble();
			double grosspay = 0;
			double remainder = 0;
			
			//calculate gross pay 
			if (hours > 54){
				remainder = hours - 54;
				grosspay = grosspay+ (remainder*payrate*2);
				remainder = 14;
				grosspay = grosspay + remainder*payrate*1.5+40*payrate; 
			}
			else if (40 > hours && hours > 54) {
				remainder = hours - 40;
				grosspay = grosspay + remainder*payrate*1.5 + 40*payrate;
			}
			else {
				grosspay = grosspay + hours*payrate; 
				
			}
			
			//present results
			System.out.println("Your gross pay is " + grosspay + ".");
			
			//ask again
			
		}while (answer.equals("Y"));
		
			
		
	}
}