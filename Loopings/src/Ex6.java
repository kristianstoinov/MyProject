import java.util.Scanner;


public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum = 0;
		System.out.println("Please enter a positive number:");
		num = sc.nextInt();
		if (num < 0) {
			System.out.println("Invalid input!");
		} else {
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println("The sum is: " + sum);

		}

	}

}
