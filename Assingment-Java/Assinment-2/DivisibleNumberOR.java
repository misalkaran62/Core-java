//Write a program to check whether given number is divisible by 5 or 7? (with || operator and with else if)

import java.util.Scanner;

	public class DivisibleNumberOR{
		
		public static void main(String[] args){
		
			Scanner sc = new Scanner(System.in);
		
			int num;
			System.out.println("Enter the Number !! ");
			num=sc.nextInt();
		
			if(num % 5 == 0 || num % 7 == 0){
				System.out.println("This Number Is Divisible 5 and 7 !! ");
			}
			else{
				System.out.println("This Number is Not Divisible by 5 and 7");
			}
	}

}
			