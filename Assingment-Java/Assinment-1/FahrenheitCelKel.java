//Accept temperatures in Fahrenheit(F) and print it in Celsius(C) and Kelvin (K):-


import java.util.Scanner;

	public class FahrenheitCelKel{

		public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			float fahrenheit,celsius,kelvin;
			
			System.out.println("Enetr the Fahrenheit Tempreture : ");
			fahrenheit=sc.nextFloat();
			
			celsius = (fahrenheit-32) * 5/9f;
			kelvin = celsius + 273.15f;

			System.out.println("Celsisu is :-"+celsius);
			System.out.println("Kelvin is  :-"+kelvin);
	sc.close();
	
	}

}