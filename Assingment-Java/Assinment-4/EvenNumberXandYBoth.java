//Write a program to print even numbers from x to y (both inclusive) (or oddnumbers)

import java.util.Scanner;
	public class EvenNumberXandYBoth{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter First Number :");
			int x = sc.nextInt();
			
			System.out.println("Enter Secound Number :");
			int y = sc.nextInt();
			System.out.println("~~~~");
		for(int i = x; i <= y; i++){
				if(i % 2 == 0){
					System.out.println(i);
				}
			}
	
	}
}