//Write a program to find sum of x to y (both inclusive)

import java.util.Scanner;
		public class SumOFXandYBoth{
			public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
			
				System.out.println("Enetr First Number :");
				int x = sc.nextInt();
		
				System.out.println("Enetr Secound Number :");
				int y = sc.nextInt();
				
				int sum = 0;
				for (int i = x; i <= y; i++){
						sum += i;
					}
				System.out.println("Sum Of :" + sum);
		
		}

}
