////Write a program to print odd numbers from 1 to N 

import java.util.Scanner;
	public class OddNumberEvenOnetoN{
			public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enetr The Number :");
			int N = sc.nextInt();
			
			System.out.println("~~~~~~~~");

			for(int i = 1; i <= N;i++){
				if(i % 2 != 0){
					System.out.println(i);
				}
			}
	}

}