//Write a program to compare two numbers? (==,>,<)

import java.util.Scanner;

	public class CompareTwoNumber{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
				
			System.out.println("Enter First Number ");
			int a = sc.nextInt();
		
			System.out.println("Enetr Secound Number ");
			int b =sc.nextInt();
		
			if( a == b ){
				System.out.println("Equal Number !! ");
			}
			else if( a > b){
				System.out.println("Firat number Grater then secound number");
			}
			else{
				System.out.println("Secound is Grater than First number ");
			}
	}

}