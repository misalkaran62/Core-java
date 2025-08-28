//Write a program to check whether given number if palindrome number.

import java.util.Scanner;
	public class PalindromeNumber{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a Number :");
			int num = sc.nextInt();
	
			int original = num;
			int reverse = 0,digit;
			
			while(num > 0){
				digit = num % 10;
				reverse= (reverse * 10) + digit;
				num = num / 10;
			}
			if(reverse == original )
				System.out.println("Palidrome Number !!");
			else
				System.out.println("Not palidrome Number !!");
		}

}