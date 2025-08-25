//The basic salary of an employee is decided at the time of employment, which
//may be different for different employees. Apart from basic, employee gets 10%
//of basic as house rent, 30% of basic as dearness allowance. A professional tax of
//5% of basic is deducted from salary. Accept the employee id and basic salary for
//an employee and output the take home salary of the employee.

import java.util.Scanner;

	public class EmployeeSalary{
		public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		String name;
		int ID;
		float HRA,DA,PT,GrossSalary,takehome,basicSalary;
		
		System.out.println("Enter Employee Details :");

		System.out.println("Emplayee ID : ");
		ID=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Employee Name :");
		name=sc.nextLine();
		

		System.out.println("Basic Salary :");
		basicSalary=sc.nextFloat();
		
		System.out.println(" HRA (%) :");
		HRA=sc.nextFloat();
		
		System.out.println(" DA (%) :");
		DA=sc.nextFloat();
		
		System.out.println(" PT (%) : ");
		PT=sc.nextFloat();
		
		
		HRA=( HRA / 100) * basicSalary;
		DA=( DA / 100) * basicSalary;
		PT=( PT /100 ) * basicSalary;
		
		GrossSalary = basicSalary + HRA + DA;
		takehome = GrossSalary - PT;
		
		System.out.println("~~~~~Emaloyee Salary Slip~~~~~");
		System.out.println("Employee ID          : " +ID);
		System.out.println("Employee Name        : " +name);
		System.out.println("Basic Salary         : " + basicSalary);
		System.out.println("House Rent           : " + HRA);
		System.out.println("Dearness Allowance   : " + DA);
		System.out.println("Professional tax     : " + PT);
		System.out.println("Take home salary     : " + takehome);

	}
}


	