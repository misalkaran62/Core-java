//Accept three sides of triangle as input, and print whether the triangle is valid or not

import java.util.Scanner;
		public class TriangleValidOrNot{
			public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter First Number");
			int a = sc.nextInt();
			
			System.out.println("Enter Secound Number");
			int b = sc.nextInt();
		
			System.out.println("Enter third Number");
			int c = sc.nextInt();
			
			if( a + b > c && a + b > b && c + b > a){
				System.out.println("This is valid triangle ");
			}
			else{
				System.out.println("Not Valid !! ");
			}
	}
}
				