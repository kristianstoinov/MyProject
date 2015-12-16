import java.util.Scanner;

public class Ex24 {
	private static Scanner sc;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int palindrome = 0;
		int originalNum=0;
		System.out.println("Please enter a number:");
		num = sc.nextInt();
		if (num < 10 || num > 30000) {
			System.out.println("Invalid input!");
		} else {
			originalNum = num;
			do {
				palindrome *= 10;
				palindrome += num % 10;
				num /= 10;
			} while (num != 0);
			if (originalNum == palindrome) {
				System.out.println("The number is a palindrome!");
			} else {
				System.out.println("The number is NOT a palindrome!");
			}

		}

	}

}
