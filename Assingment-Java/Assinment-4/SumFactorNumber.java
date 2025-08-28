//Write a program to print sum of factors of a given numbe

import java.util.Scanner;
	public class SumFactorNumber{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a Number :");
			int num = sc.nextInt();
			
			int sum = 0;
		
			for( int i = 1;i <= num; i++){
				if(num % i == 0){
					sum = sum + i;
				}
			}
			System.out.println("Sum of Factor :" + sum);

		}
	}