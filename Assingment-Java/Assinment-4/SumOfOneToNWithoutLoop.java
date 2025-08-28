//Write a program to find sum of 1 to N (sum of first N numbers) (with and without loop)

import java.util.Scanner;
		public class SumOfOneToNWithoutLoop{
			public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enetr A number :");
			int n = sc.nextInt();
	
			int sum = n * (n+1) /2;
			System.out.println("Sum is : " + sum);
		}
}