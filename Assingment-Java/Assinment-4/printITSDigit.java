//Write a program that accepts a number and print it’s all digits

import java.util.Scanner;
	public class printITSDigit{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enetr A Number : ");
			int n = sc.nextInt();
	
			while(n > 0){
				int digit = n % 10 ;
				System.out.print(digit);
				n = n / 10;
			}
		}
 }
		