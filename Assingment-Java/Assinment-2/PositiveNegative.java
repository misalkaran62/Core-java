//Write a program to check whether given number is positive or negative

import java.util.Scanner;

	public class PositiveNegative{
		public static void main(String[] args){
			
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enetr the Number : ");
		num=sc.nextInt();
		
		if(num > 0){
			System.out.println("Positive Number !! ");
		}
		else if(num < 0){
			System.out.println("Negative Number !! ");
		}
   }
}
			