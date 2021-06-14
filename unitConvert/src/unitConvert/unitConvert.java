package unitConvert;

import java.util.Scanner;

public class unitConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean convert = true;
		double value;
		double result;

		while (convert) {

			menu();

			String Choice = input.nextLine();

			switch (Choice) {
			case "1": {
				System.out.println("Enter the number of Cups");
				value = input.nextDouble();
				result = cupsToTsp(value);
				System.out.println(value + " cups is equal to " + result + " Tsp \n");

				break;
			}
			case "2": {
				System.out.println("Enter the number of Miles");
				value = input.nextDouble();
				result = milesToKilometers(value);
				System.out.println(value + " miles is equal to " + result + " kilometers \n");
				break;
			}
			case "3": {
				System.out.println("Enter the number of US Gallons");
				value = input.nextDouble();
				result = cupsToTsp(value);
				System.out.println(value + " US Gallons is equal to " + result + " Imperial Gallons \n");

				break;
			}
			case "4": {

				convert = false;
				System.out.println("Thank you for using our app!");
				input.close();
				break;
			}
			default: {

				System.out.println("Please enter a number from 1 to 4 /n");
			}
			}

		}

	}

	public static double cupsToTsp(double value) {

		return value * 48;
	}

	public static double milesToKilometers(double value) {
		return value * 1.6094;
	}

	public static double usgalToImgal(double value) {
		return value * 0.83267;
	}

	public static void menu() {
		System.out.println("Please choose an option: by entering the number");
		System.out.println("1.  Cups to Teaspoons");
		System.out.println("2.  Miles to Kilometers");
		System.out.println("3.  US Gallons to Imperial Gallons");
		System.out.println("4.  Quit");
	}

}
