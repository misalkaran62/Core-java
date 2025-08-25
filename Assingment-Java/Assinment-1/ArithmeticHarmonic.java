//Accept two numbers and print arithmetic and harmonic mean the two numbers

import java.util.Scanner;

	public class ArithmeticHarmonic{
		public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		double  a,b,arithmetic,harmonic;
		
		System.out.println("Enter First Number :");
		a=sc.nextDouble();
		
		System.out.println("Enter Second  Number  :");
		b=sc.nextDouble();

		arithmetic=( a + b ) / 2;	
		harmonic=(2 * a * b) / (a + b);

		System.out.println("Arthmatic Mean :" + arithmetic);
		System.out.println("Harmonic Mean  :" +harmonic);
	}
}