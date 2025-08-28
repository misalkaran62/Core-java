//Write a program to accept to integers x and n computer x^n.

import java.util.Scanner;
	public class IntegersComputer{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter X integers :");
			int x = sc.nextInt();

			System.out.println("Enter N Computer :");
			int n = sc.nextInt();
			
			int result = 1;
		
			for (int i = 1; i <= n; i++){
				result = result * x;
			}
		
			System.out.println("Raised Power = " + result);
	}

}

	