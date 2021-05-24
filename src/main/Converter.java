package main;

import java.util.Scanner;


public class Converter {
	
	public static int unit = 0;
	static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		
		// Scanner object
		Scanner scanner = new Scanner(System.in);

		// Declare variable
		int menuSelection = 0;
				
		// Iterate through the Unit menu
		while(menuSelection != 4) {
			menu();
			menuSelection = scanner.nextInt();
			
			// switch between 4 units
			switch(menuSelection) {
			case 1:
				cmToInch();
				break;
			case 2:
				cToF();
				break;
			case 3:
				kgToLb();
				break;
			case 4:
				quit();
			}
 
		}
		scanner.close();
	}
	
	// Menu & Conversion Methods
	public static void menu() {
		System.out.println("Unit Menu:\n"
				+ "1. Centimeter(cm) to Inch(in)\n"
				+ "2. Celsius to Fahrenheit\n"
				+ "3. Kilogram(kg) to Pound(lb)\n"
				+ "4. Quit");
	}
	
	public static void cmToInch() {
		System.out.println("Input Centimeters to convert to Inches: ");
		unit = scanner.nextInt();
		System.out.println(unit + " cms = " + (unit * 0.393701) + " inches.");
	}

	public static void cToF() {
		System.out.println("Input temperature in Celsius to convert to Fahrenheit: ");
		unit = scanner.nextInt();
		System.out.println(unit + " ˚C = " + ((unit * 9/5) +  32) + " ˚F");		
	}

	public static void kgToLb() {
		System.out.println("Input Kilograms to convert to Pounds: ");
		unit = scanner.nextInt();
		System.out.println(unit + " kgs = " + (unit * 2.2) + " lbs.");
	}

	public static void quit() {
		System.out.println("Thank you for using the unit converter!");
		scanner.close();
	}
}
