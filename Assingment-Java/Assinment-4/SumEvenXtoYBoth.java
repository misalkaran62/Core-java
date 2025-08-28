//Write a program to find sum of even numbers from x to y (both inclusive) (or odd numbers)

import java.util.Scanner;
		public class SumEvenXtoYBoth{
			public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enetr First Number :");
			int x = sc.nextInt();
			
			System.out.println("Enetr Secound Number :");
			int y = sc.nextInt();

			int sum = 0;

			for(int i = x; i <= y; i++){
				if( i % 2 == 0){
					sum += i;
				}
			}
			System.out.println("Sum of Even Number :" + sum);
	}

}