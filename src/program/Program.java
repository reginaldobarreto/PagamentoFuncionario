package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Employee;
import entities.OutSourceEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employees: ");
		int choice = sc.nextInt();
		
		List<Employee> employee = new ArrayList<>();
		
		for(int x = 0; x < choice ; x++) {
			System.out.println("EMPLOYEE #" + (x+1) + " DATA:");
			System.out.print("Outsourced (y/n) ? ");
			String out = sc.next();	
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();

			if(out.equals("y")) {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				employee.add(new OutSourceEmployee(name, hours, valuePerHour, additionalCharge));
			}else {
				employee.add(new Employee(name, hours, valuePerHour));
			}
			
		}
		
		for (Employee obj : employee) {
			System.out.println(obj);
		}
			
		sc.close();
	}
}