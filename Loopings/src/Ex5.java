import java.util.Scanner;


public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Please enter first number:");
		num1 = sc.nextInt();
		System.out.println("Please enter second number:");
		num2 = sc.nextInt();
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		} else if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("Invalid input!");
		}


	}

}
