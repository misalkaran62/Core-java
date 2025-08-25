//Write a Program to convert lowercase letter into uppercase letter and vice versa

import java.util.Scanner;
		public class LowercaseUppercase{
			public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
			
				System.out.println("Enter the Character : ");
				char ch = sc.next().charAt(0);

				if(ch >= 'a' && ch <= 'z'){
					ch = (char) (ch - 32);
					System.out.println("UpperCase : " + ch);
				}
				else if(ch >= 'A' && ch <= 'Z'){
					ch = (char) (ch + 32);
					System.out.println("LowerCase : " + ch);
				}
				else{
					System.out.println("Not an Alphabet !! ");
				}


	}

}