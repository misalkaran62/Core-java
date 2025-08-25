//Write a program, which accepts two integers and an operator as a character (+ - * /), performs the corresponding operation and displays the result.

import java.util.Scanner;
	public class OperationIntegers{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter First Number :");
			int a = sc.nextInt();
		
			System.out.println("Enter Secound Number :");
			int b = sc.nextInt();
		
			System.out.println("Enter Oparator  + , -, *,/ :");
			char op =sc.next().charAt(0);
		
			int result = 0;

			switch(op){
				case '+' :
					result = a + b ;
					System.out.println("Result : " + result);
					break;
				case '-' :
					result = a - b ;
					System.out.println("Result : " + result);
					break;
				case '*' :
					result = a * b ;
					System.out.println("Result : " + result);
					break;
				case '/' :
					if(b != 0){
						result = a / b;
						System.out.println("Result : " + result);
					}
					else{
						System.out.println("Division by Zero Note Allowed");
					}

				default:
					System.out.println("Invalid Operator !! ");
			}

		}

	}
					