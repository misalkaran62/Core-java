
import java.util.Scanner;
	public class MinimumMaximumFindd{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter First Number ");
				int a = sc.nextInt();
		
				System.out.println("Enter Secound Number ");
				int b = sc.nextInt();

				System.out.println("Enter Third Number ");
				int c =sc.nextInt();
			
			if(a > b){

				if( a > c)

				System.out.println("Maximum First number !!");
				else
				System.out.println("Maximum third Number !! ");
			}
			else{
				if(b > c )
				System.out.println("Maximum Secound Number !! ");
				else
				System.out.println("Maximum Third Number !! ");
			}
	}

}
				
			