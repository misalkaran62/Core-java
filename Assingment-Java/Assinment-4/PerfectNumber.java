//Write a program to check whether a given number is perfect number.

import java.util.Scanner;
	public class PerfectNumber{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter Number :");
			int num = sc.nextInt();
		
			int sum = 0;
			for(int i = 1; i < num;i++){
				if(num % i == 0){
					sum = sum + i;
				}
			}
		if(sum == num)
			System.out.println("Perfact Number !!");
		else
			System.out.println("Not Perfact Numner !!");
	}
}