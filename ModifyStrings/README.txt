README

Fiona Rowan

java files: StringTester (main), StringFunctions

STRINGTESTER.java
This class prompts the user for a string. Then it acts the user if she
wants to see the (1) upper case letters of that string, (2) every second letter, 
(3) the same string but with the vowels replaced with underscores, (4) the number
of vowels, and (5) the position of the vowels in the string. 
Then it prints the result of the appropriate method in StringFunctions with the 
input string as the argument. 

STRINGFUNCTIONS.java
This class has a method for every option.
(1) getUpperCaseLetters(String s) - for every character c in s, it adds the character 
to String result if it is equal to Character.toUpperCase(c). Returns result.
(2) everySecondLetter(String s) - starting at position 1 of s, it adds the character at
that position as long as it is not a space. If it is a space, it goes to the next
position. Then it increments the position by 2. Returns result.
(3) replaceVowelsWithUnderscores(String s) - using the replace(c, "_") String function, 
it replaces all vowels with underscores. Returns modified String.
(4) numberOfVowels(String s) - this initializes a counter to 0. It iterates through 
the String, and at every position, if character c is a vowel, it increments the 
counter. Returns counter.
(5) positionOfVowels(String s) - this iterates through the String, and at every position,
if character c is a vowel, it adds its position i in the String to the String
"positions". Returns positions. 
