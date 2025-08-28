//Write a program which accepts a number and display each digit of number in words.

import java.util.Scanner;
	public class DigitToWords{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Number :");
			int num = sc.nextInt();
			
			if(num == 0){
				System.out.println("Zero");
				return;
			}

			String s = String.valueOf(num);
			
			for(int i =0;i < s.length();i++){
				char ch = s.charAt(0);
		
				switch(ch){
					case '0':System.out.println("Zero ");break;
					case '1':System.out.println("One ");break;
					case '2':System.out.println("Two ");break;
					case '3':System.out.println("Three ");break;
					case '4':System.out.println("Four ");break;
					case '5':System.out.println("Five ");break;
					case '6':System.out.println("Six ");break;
					case '7':System.out.println("Seven ");break;
					case '8':System.out.println("Eight ");break;
					case '9':System.out.println("Nine ");break;

			}
		}

	}

}