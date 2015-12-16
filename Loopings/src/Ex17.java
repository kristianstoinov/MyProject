import java.util.Scanner;


public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b;
		char c;
		System.out.println("Please enter the side of the square:");
		b = sc.nextInt();
		if (b < 3 || b > 20) {
			System.out.println("Invalid input!");
		} else {
			System.out.println("Please enter a symbol:");
			c = sc.next().charAt(0);
			for (int i = 1; i <= b; i++) {
				if (i == 1 || i == b) {
					for (int j = 1; j <= b; j++) {
						System.out.print("*");
					}
					System.out.println();
				} else {
					System.out.print("*");
					for (int j = 1; j <= (b - 2); j++) {
						System.out.print(c);
					}
					System.out.print("*");
					System.out.println();
				}
			}

		}

	}

}
