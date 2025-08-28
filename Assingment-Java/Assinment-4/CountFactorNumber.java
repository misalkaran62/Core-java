//Write a program to count factors of a given number

import java.util.Scanner;
	public class CountFactorNumber{
			public static void main(String[] args){
				Scanner sc = new Scanner(System.in);

				System.out.println("Enter a Number :");
				int num = sc.nextInt();
			
				int count = 0;
		
				for(int i = 1;i <= num; i++){
					if(num % i == 0){
						count++;
					}
				}
			System.out.println("Count is : " + count);
		}
	}