import java.util.Scanner;
	public class DivisibleByNumberNestedIf{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
		
			int num;
			
			System.out.println("Enter the Number ! :");
			num=sc.nextInt();
		
			if(num % 5 == 0){
				System.out.println("This number is Divisible by 5 !!");
			}
			if(num % 7 == 0){
				System.out.println("This number is Divisible by 7 !! ");
			}
			else{
				System.out.println("This Number is not Divivsible By 5 and 7 !!");
			}
	}

}