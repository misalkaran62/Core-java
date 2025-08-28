//Write a program to print hello N times

import java.util.Scanner;
	public class HelloNTimesPrint{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enetr  number :");
			int n = sc.nextInt();

			for(int i = 0; i < n; i++){
				System.out.println("Hello World ");
			}
		}
	}