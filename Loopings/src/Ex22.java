import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int input = sc.nextInt();
		int n = 1;
		int newNum = input + 1;

		if (input >= 1 && input <= 999) {

			while (n <= 10) {

				if (newNum % 2 == 0 || newNum % 3 == 0 || newNum % 5 == 0) {
					System.out.println(n + ":" + newNum);
					newNum++;
					n++;
				} else {
					newNum++;
				}
			}
		} else {
			System.out.println("Wrong input!");
		}

	}

}
