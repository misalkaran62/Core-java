//Accept two integers from the user and interchange them. Display the
//interchanged numbers. Using temporary variable

import java.util.Scanner;

	public class TemporaryVariable{
		public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int temp,a,b;

		System.out.println("Enter the Firat Number : ");
		a=sc.nextInt();
		System.out.println("Enter the Secound Number : ");
		b=sc.nextInt();
		
		temp = a;
		a = b;
		b = temp;

		
		System.out.println("After InterChange !! ");
		System.out.println("First Number : "+ a );
		System.out.println("Secound Number : "+ b );
	}
}