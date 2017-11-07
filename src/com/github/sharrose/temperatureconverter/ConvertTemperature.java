package com.github.sharrose.temperatureconverter;
import java.util.Scanner;

public class ConvertTemperature {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner (System.in);
			System.out.print("Enter the current temperature (F): ");
			String sTemp = scanner.nextLine();
			double fahrenheit  = Double.parseDouble (sTemp);
			double celsius = (fahrenheit - 32) * 5 / 9;
			System.out.printf("The temperature in Celsius is %2.2f\n", celsius);
		} catch (NumberFormatException e) {
			System.out.println( "You entered some weird data, ya dummy!" );
			e.printStackTrace();
		}
	}

}
