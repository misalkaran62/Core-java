//Write a program to find sum of 1 to N (sum of first N numbers) (with and without loop)

import java.util.Scanner;
	public class SumOfOneToNWithLoop{
			public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
					
				System.out.println("Enetr the Number ");
				int n = sc.nextInt();
						
				int sum =0;
					
				for(int i = 0; i <= n; i++){
					sum += i;
				}
			System.out.println("Sum Of To N : " +sum);
		}
}