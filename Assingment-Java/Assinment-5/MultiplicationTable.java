//Write a program to print multiplication table between 1 to n

import java.util.Scanner;
		public class MultiplicationTable{
			public static void main(String[] args){
				
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Number");
			int num = sc.nextInt();

			for(int i = 1;i <= num;i++){
				for(int j = 1; j <= 10;j++){
				System.out.println( i +"x" + j +" = " + (i * j));
				}
			System.out.println();
		}
	}
}