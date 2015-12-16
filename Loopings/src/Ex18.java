import java.util.Scanner;

public class Ex18 {
	private static Scanner sc;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		int firstNum = sc.nextInt();
		System.out.println("Please enter second number: ");
		int secondNum = sc.nextInt();
		if ((firstNum < 1 || firstNum > 9) || (secondNum < 1 || secondNum > 9)) {
			System.out.println("Wrong input");
		} else {
			for (int j = 1; j <= firstNum; j++) {
				for (int k = 1; k <= secondNum; k++) {
					int product = j * k;
					System.out.println(j + "*" + k + " = " + product);
				}
			}

		}

	}

}
