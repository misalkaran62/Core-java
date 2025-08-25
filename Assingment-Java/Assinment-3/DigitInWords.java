//Accept a single digit from the user and display it in words. For example, if digit entered is 9, display Nine.

import java.util.Scanner;
		public class DigitInWords{
			public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
		
				System.out.println("Enetr Digit From 1 to 9");
				int digit = sc.nextInt();
	
				switch(digit){
				
				case 0 :System.out.println("Zero");
					return;
				case 1 :System.out.println("One");
					return;
				case 2 :System.out.println("Two");
					return;
				case 3 :System.out.println("Three");
					return;
				case 4 :System.out.println("Four");
					return;
				case 5 :System.out.println("Five");
					return;
				case 6 :System.out.println("Six");
					return;
				case 7 :System.out.println("Seven");
					return;
				case 8 :System.out.println("Eight");
					return;
				case 9 :System.out.println("Nine");
					return;
			default:
				System.out.println("Not Singl Digit");
				}
	}

}