//Write a program to find maximum of three numbers? (3-4 logics) and (with conditional operator). Modify and find minimum of three numbers.

import java.util.Scanner;
	public class MinimumMaximumFind{
			public static  void main(String[] args){
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter First Number ");
				int a = sc.nextInt();
		
				System.out.println("Enter Secound Number ");
				int b = sc.nextInt();

				System.out.println("Enter Third Number ");
				int c =sc.nextInt();
		
				if(a > b && a > c){
					System.out.println("Maximum First Number  !! ");
				}
				else if(b > a && c > a){
					System.out.println("Maximum Secound Number !! ");
				}
				else{
					System.out.println("Maximum Third Number !! ");
				}

	}

}
