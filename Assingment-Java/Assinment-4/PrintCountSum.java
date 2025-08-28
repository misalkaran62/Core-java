//Write a program to print, count and sum of factors

import java.util.Scanner;
	public class PrintCountSum{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter Number :");
			int num = sc.nextInt();
			int sum = 0,count = 0;
			for(int i = 1;i <= num;i++){
				if(num % i == 0){
				System.out.println("Print factor " + i);
				count++;
				sum = sum + i;
			}
		}
		
		System.out.println("Total Factor =" + count);
		System.out.println("Sum of Factor = " + sum);
	}
}



				