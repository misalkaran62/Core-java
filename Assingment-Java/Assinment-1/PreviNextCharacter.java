//Accept a character from the keyboard and display its previous and next character
//in order. Ex. If the character entered is ‘d’, display “The previous character is c”,
//“The next character is e”

import java.util.Scanner;
	public class PreviNextCharacter{
		public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		char character,previous,next;

		System.out.println("Enter the Character  :");
		character =sc.next().charAt(0);
	
		previous =(char)(character - 1);
		next =(char)(character + 1);

	System.out.println("Previous Character is : " + previous);
	System.out.println("Next Character is     : " + next);
  }

}