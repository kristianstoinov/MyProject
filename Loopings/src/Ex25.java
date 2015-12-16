import java.util.Scanner;

public class Ex25 {
	private static Scanner sc;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Please enter a number to calculate it's factorial: ");
		int factorial = sc.nextInt();
		int product = 1;
		int n = 1;
		if (factorial < 0) {
			System.out.println("Wrong input!");
		} else {
			do {

				product *= n;
				n++;
			} while (factorial >= n);
			System.out.println("The product is: " + product);

		}

	}

}
