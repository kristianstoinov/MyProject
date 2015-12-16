import java.util.Scanner;

public class Ex16 {
	private static Scanner sc;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert a three digit number :");
		int number = sc.nextInt();
		int firstDigit = number % 10;
		int secondDigit = (number / 10) % 10;
		int thirdDigit = (number / 100) % 10;
		if (number > 99 && number < 1000) {

			if ((firstDigit == secondDigit) && (secondDigit == thirdDigit)) {
				System.out.println("All the digits are equal.");
			} else if ((thirdDigit > secondDigit) && (secondDigit > firstDigit)) {
				System.out.println("The digits are in an ascending order.");
			} else if ((firstDigit > secondDigit) && (secondDigit > thirdDigit)) {
				System.out.println("The digits are in a descending order.");
			} else {
				System.out.println("The digits of the number are unsorted");
			}

		} else {
			System.out.println("Number out of bounds!");
		}
	}

}
