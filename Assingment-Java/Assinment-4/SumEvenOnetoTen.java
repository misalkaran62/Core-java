//Write a program to find sum of even numbers from 1 to N (

import java.util.Scanner;
		public class SumEvenOnetoTen{
			public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
		
			System.out.println("Enetr Number :");
			int n = sc.nextInt();
				
			int sum = 0;
			for(int i = 0; i <= n; i++){
				if(i % 2 == 0){
					sum += i;
					
				}
			}

			System.out.println("Sum of Even number :" + sum);
	}
}