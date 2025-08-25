//Write a program to check whether given number is even or odd Conditional

import java.util.Scanner;

	public class EvenOddNumberCondi{
		public static void main(String[] args){
			
		Scanner sc = new Scanner(System.in);
		
			int num;
			System.out.println("Enter the Number : ");
			num=sc.nextInt();
			
			System.out.println((num % 2 == 0) ? "Number is Even" : "Number is Odd");

	}
}