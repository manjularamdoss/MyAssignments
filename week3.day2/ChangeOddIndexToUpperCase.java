package week3.day2;

public class ChangeOddIndexToUpperCase {

	static 
	String  text="changename";//String test = "changeme";
	char[] ch = text.toCharArray();//Convert the String to character array
	

		  public static void main(String[] args) {
			  for (int i = 0, len = text.length(); i < len; i++) {// Traverse through each character (using loop)
				    char ch = text.charAt(i);
				    if (i % 2 == 0) {//find the odd index within the loop (use mod operator)
				        System.out.print(Character.toLowerCase(ch));//within the loop, change the character to uppercase, if the index is odd else don't change
				    } else {
				        System.out.print(Character.toUpperCase(ch));
				    }
				}
				
		  }
}

	