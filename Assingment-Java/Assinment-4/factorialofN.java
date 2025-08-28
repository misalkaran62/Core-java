//Write a program to find factorial of N (N!).(3! = 3*2*1 or 1*2*3)

import java.util.Scanner;
	public class factorialofN{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enetr A Number :");
			int n = sc.nextInt();
			
			int fact = 1;
			for(int i = 1; i <= n; i++){
				fact = fact * i;
			}
		System.out.println("Factorial of Number :" + fact);
	}
}