README

Fiona Rowan

java files: Seat, SeatChart, SeatingTest (main) 

This program is meant to be a tool for ticket salesmen, who want to show 
customers the seating chart and allow them to purchase seats either by the 
seat position or price. 

SEATINGTEST.java
Initializes a two dimensional integer array of seats / prices called "prices".
It then creates a SeatChart object x and passes this 2D array into the constructor.
Then it calls the buy() method on x. 

SEATCHART.java
The constructor passes "prices" into the method resetChart(prices). 
resetChart() creates a new Seat[][] object "seatingChart" of the same size 
as the prices matrix.
Then it creates a new Seat object at every position in seatingChart[i][j] that 
takes in the corresponding prices[i][j].
The buy() method: This prompts the user to either purchase a seat by position 
or by price. If the user wants to purchase by position, the program determines 
whether the seat is available (or "valid"). If the user wants to purchase by 
price, a new Seat object is created and the program finds a valid seat in the chart
that has the same price. The position of the seat is returned in both cases to be 
pos1 and pos2, and if the seat is valid, then buy(pos1, pos2) is called. 
buy(int pos1, int pos2): this changes the seat in the seating chart at the given
position to have a price of zero (seat.changePrice(0)). 
noSeats(): this makes sure there aren't no seats left. 
purchaseAnother(): user is asked if she wants to purchase another, and the program 
either allows her to buy another seat or the program quits. 


SEAT.java
This keeps the price of each seat. The price can be accessed with getPrice(), 
and the price can be changed to i with changePrice(int i). 
There is an equals method: two seats are equal if their prices are equal. 

