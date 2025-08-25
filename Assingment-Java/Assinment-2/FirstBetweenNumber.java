//Write a program to accept three numbers and check whether the first is
//between the other two numbers


import java.util.Scanner;
	public class FirstBetweenNumber{
		public static void main(String[] args){
		
		Scanner sc =new Scanner(System.in);
		int num1,num2,num3;

		System.out.println("Enter First Number !! ");
		num1=sc.nextInt();
		
		System.out.println("Enter Second Number !! ");
		num2=sc.nextInt();
		
		System.out.println("Enter third Number !! ");
		num3=sc.nextInt();
		
		if((num1 > num2  && num1 < num3) || (num1 > num3 && num1 < num2)){
			System.out.println("This  Between Two number");
		}
		else{
			System.out.println("This  Not Between Two Number");
		}
	}
}