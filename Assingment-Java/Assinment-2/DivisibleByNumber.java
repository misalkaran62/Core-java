//Write a program to check whether given number is divisible by 5 and 7? (with && operator and with nested if)

import java.util.Scanner;
	public class DivisibleByNumber{
		public static void main(String[] args){
			
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Enetr the Number :");
		num=sc.nextInt();
		
		if( num % 5 == 0 && num % 7 == 0){
			System.out.println("The Give number is Divisible BY 5 and 7 !!" + num);
		}
		else{
			System.out.println("The Give number is Not Divisible BY 5 and 7 !!" + num);
		}
	}
}
