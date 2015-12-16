import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int i = 100;
		int sumNum = 0;
		System.out.println("Please enter a number from 2 to 27 :");
		sum = sc.nextInt();
		if (sum < 2 || sum > 27) {
			System.out.println("Invalid input!");
		} else {
			int firstDigit;
			int secondDigit;
			int thirdDigit;
			while (i < 1000) {
				firstDigit = i / 100;
				secondDigit = (i % 100) / 10;
				thirdDigit = i % 10;
				sumNum += firstDigit;
				sumNum += secondDigit;
				sumNum += thirdDigit;
				if (sumNum == sum) {
					System.out.print(i + " ");
				}
				i++;
				sumNum = 0;
			}
		}
	}

}
