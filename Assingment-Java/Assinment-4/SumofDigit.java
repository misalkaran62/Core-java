//Write a program to find sum of digits of given number.

import java.util.Scanner;
	public class SumofDigit{
		public static void main(String[] agrs){
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enetr A number : ");
			int num = sc.nextInt();
		
			int sum = 0;
			
			while(num > 0){
				int digit = num % 10;
				sum = sum + digit;
				num = num /10;
			}

		System.out.println("Sum Of Number :" + sum);
	}
}