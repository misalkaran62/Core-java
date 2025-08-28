//Write a program to check whether a given number is Armstrong number.

import java.util.Scanner;
	public class ArmstrongNumber{
		public static void main(String[] ars){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Number :");
			int num = sc.nextInt();
		
			int original = num;
			int count = 0;

		int temp =num;
			while(temp >0){
				temp = temp /10;
				count++;
			}
			
			int sum = 0;
			temp = num;
			while(temp > 0){
				int digit = temp % 10;
				sum = sum +(int)Math.pow (digit ,count);
				temp = temp /10;
			}
			
			if(sum == original)
				System.out.println("Armstorng");
			else
				System.out.println("Not Armstong");
		}
}
				