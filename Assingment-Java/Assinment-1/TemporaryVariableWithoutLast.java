//Accept two integers from the user and interchange them. Display the
//interchanged numbers. Without temporary variable Using + and – operator

import java.util.Scanner;

	public class TemporaryVariableWithoutLast{
		public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;

		System.out.println("Enter the Firat Number : ");
		a=sc.nextInt();
		System.out.println("Enter the Secound Number : ");
		b=sc.nextInt();
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("After InterChange !! ");
		System.out.println("First Number : "+ a );
		System.out.println("Secound Number : "+ b );
	}
}