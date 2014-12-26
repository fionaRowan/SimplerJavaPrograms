package stringModifier;

	public class StringFunctions {
	
		public static String getUppercaseLetters(String stringThing){
			String result = "";
			for (int i = 0; i < stringThing.length(); i++) {
				if (stringThing.charAt(i) == Character.toUpperCase(stringThing.charAt(i))) {
						if (stringThing.charAt(i) == ' '){
							
						}
						else {
							result = result + stringThing.charAt(i);
						}
					}
				}
				return result;
			}
		
	    public static String everySecondLetter(String stringThing){
			int n = stringThing.length();
			String result = "";
			for (int i = 1; i < n;){
				if (stringThing.charAt(i) == ' '){
					i++;
				}
				else {
					result = result + stringThing.charAt(i);
					i=i+2;	
				}
					
			}
			return result;
		}
		public static String replaceVowelsWithUnderscores(String stringThing){
			String funky = stringThing;
			funky = funky.replace('a', '_');
			funky = funky.replace('e', '_');
			funky = funky.replace('i', '_');
			funky = funky.replace('o', '_');
			funky = funky.replace('u', '_');
			return funky;
		}
		public static int numberOfVowels(String stringThing){
			int count = 0;
			for (int i = 0; i < stringThing.length(); i++) {
				if (Character.toLowerCase(stringThing.charAt(i)) == 'a'){
					count++;
				}
				if (Character.toLowerCase(stringThing.charAt(i)) == 'e'){
					count++;
				}
				if (Character.toLowerCase(stringThing.charAt(i)) == 'i'){
					count++;
				}
				if (Character.toLowerCase(stringThing.charAt(i)) == 'o'){
					count++;
				}
				if (Character.toLowerCase(stringThing.charAt(i)) == 'u'){
					count++;
				}
			}
			return count;
		}
		public static String positionsOfVowels(String stringThing){
			String positions = "";
			for (int i = 0; i < stringThing.length(); i++) {
				if (Character.toLowerCase(stringThing.charAt(i)) == 'a'){
					positions = positions + i + " ";
				}
				if (Character.toLowerCase(stringThing.charAt(i)) == 'e'){
					positions = positions + i + " ";
				}
				if (Character.toLowerCase(stringThing.charAt(i)) == 'i'){
					positions = positions + i + " ";
				}
				if (Character.toLowerCase(stringThing.charAt(i)) == 'o'){
					positions = positions + i + " ";
				}
				if (Character.toLowerCase(stringThing.charAt(i)) == 'u'){
					positions = positions + i + " ";
				}
			}
			return positions;
		}
	
	}
