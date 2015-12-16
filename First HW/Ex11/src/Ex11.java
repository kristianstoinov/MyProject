import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert a three digit number :");
		int number = sc.nextInt();
		int firstDigit = number % 10;
		int secondDigit = (number / 10) % 10;
		int thirdDigit = (number / 100) % 10;
		if (number > 99 && number < 1000) {
			if ((number % 10 == 0) || (number % 100 == 0)) {
				System.out.println("Can't enter numbers containing zero");
			} else {

				if (number % firstDigit == 0) {
					System.out.println("The number is divisable by "
							+ firstDigit);
				}
				if (number % secondDigit == 0) {
					System.out.println("The number is divisable by "
							+ secondDigit);
				}
				if (number % thirdDigit == 0) {
					System.out.println("The number is divisable by "
							+ thirdDigit);

				} else {
					System.out
							.println("The number is not divisable by any of its digits!");
				}
			}
		} else {
			System.out.println("Number out of bounds");
		}

	}

}
