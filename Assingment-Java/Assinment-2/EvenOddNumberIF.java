//Write a program to check whether given number is even or odd with (IF)

import java.util.Scanner;
	public class EvenOddNumberIF{
		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Enetr a Number : ");
		num=sc.nextInt();
		
		if(num % 2 ==0){
			System.out.println("This Number is Even !! ");
		}
		else{
			System.out.println("This Number is Odd !! ");
		}
	}
}
		