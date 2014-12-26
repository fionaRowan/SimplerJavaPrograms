README

Fiona Rowan

This program lets the user play or simulate a dice game.

The rules of the game are as such:
There are eight die. 
Each player rolls four die, and can only see their own. 
One player guesses the sum of all eight die, or "sets the line." 
The next says either "over" or "under". 
If the real sum is either over or under the "line" and the second player is right, 
then the second player wins. 
Otherwise, the first player wins. 

Program files: 
Dice.java
DiceTest.java
Game.java
Player.java
Player2.java

DICE.java
This dice objects simulates rolling a 6-sided die four times (which each player 
will do)

DICETEST.java
The main method lives here.
It determines whether the user wants to do interactive or simulation mode with 
the program.
Then it creates a new Game object for that mode and then executes the play() method.

GAME.java
This creates two players and the dice, and keeps track of their scores.
The first player to 10 wins.
If interactive == true, Player p1 is the user and p2 is what I call the "dumbComp".
The dumbComp sets the line for every round and the user guesses either over or under.
Once someone wins, the game tells the user who won and what the scores were.
If simulation == true, p1 is the "smartComp" and p2 is the "dumbComp".
They both take turn setting the line / guessing over or under. 
The game then tells the user out of 100,000 games, how many times the dumbComp and 
smartComp won, respectively. 

PLAYER.java
This is either the human user or the "smartComp".
The setLine() method is for when the smartComp is the player. Its strategy to do 
so is to add a random number between 12 and 17 to the sum of its four-die roll. 
The declareOverUnder() method is for when the human the player. If the human says
"over", the line is set to 49 (highest possible) and if she says "under" it is set to 
0 (lowest possible). 

PLAYER2.java
This is the "dumbComp."
Its strategy for "setting the line" setLine() is to choose a random number between 24 and 33.

