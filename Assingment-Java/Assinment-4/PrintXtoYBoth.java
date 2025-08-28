//Write a program to print x to y (both inclusive)

import java.util.Scanner;
	public class PrintXtoYBoth{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);	

			System.out.println("Enetr Starting Number :");
			int x = sc.nextInt();

			System.out.println("Enetr Ending Number :");
			int y = sc.nextInt();

			for(int i = x; i <= y; i++){
				System.out.println("Hello World !! ");
			}
	}

}