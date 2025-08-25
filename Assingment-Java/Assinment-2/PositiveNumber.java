//Write a program to check whether given number is positive

import java.util.Scanner;
	public class PositiveNumber{
		public static void main(String[] args){
			
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter a Number : ");
		num=sc.nextInt();
		
		if(num > 0){
			System.out.print("This Number is Positive !! ");
		}
		else{
			System.out.print("This Number is Negative !! ");

		}
       }
  }		