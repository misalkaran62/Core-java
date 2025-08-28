//Write a program that accepts a number and count the number of digits in given number.

import java.util.Scanner;
	public class CountNumber{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enetr Number :");
			int num = sc.nextInt();
			
			int count = 0;
			while(num > 0){
				num = num / 10;
				count++;
			}
		System.out.println(count);
	}

}