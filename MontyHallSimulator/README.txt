README

Fiona Rowan

java files: MontyHallTester (main), MontyHallSimulator

This program simulates the following problem: 
In the "Monty Hall" game show, there are three doors: one with a car, and two with 
goat. Monty Hall asks the player to choose one of three doors. 
Then, he often reveals one of the doors you didn't choose to be a goat, and says
"would you like to change your door?" 

The question is: are you better off staying with or changing your door of choice?
The answer: you're better of changing! 
Reasoning: When you chose your door, you had a 1/3 probability of being right.
If you change your answer, you actually increase your probability of being right 
to 2/3. This is because the new door encompasses the probability of either of the 
doors you didn't choose to be the door with the car behind it. 
PROBABILITY IS FUN!!!! 

MONTYHALLTESTER.java
The main method lives here. It prompts the user for an integer n of how many times
the Monty Hall game should be played in the simulation.
It creates a MontyHallSimulator object "sim", and executes the method "simulate(n)"
on it.
It then prints the number of times the game was won by staying with or changing the 
door. 

MONTYHALLSIMULATOR.java
the method simulate(int n) creates a new Random variable. 
It chooses a random number between 1 and 3 for the player's door and the 
door behind which the car is in. 
If the player's pick and the car's door are the same, then the player would win
by staying (stay++). 
If the player's pick and the car's door are not the same, then the player would
win by changing (channge++).
It simulates doing this n times.
There are also two accessor methods: getStayWins() and getChangeWins(), which 
returns the "change" and "stay" counters.
