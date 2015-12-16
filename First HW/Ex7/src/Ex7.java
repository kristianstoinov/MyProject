import java.util.Scanner;

public class Ex7 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("Please insert the hour:");
		int hour = sc.nextInt();
		System.out.println("Please insert the sum of money:");
		float money = sc.nextFloat();
		System.out.println("Please insert if you are healthy");
		boolean amHealthy = sc.nextBoolean();

		if (amHealthy == false) {
			System.out.println("Stay home , get rich!");
		}
		if (money > 0 && amHealthy == false) {
			System.out.println("Buy my medicine!");
		}
		if (money <= 0 && amHealthy == false) {
			System.out.println("Stay home , drink tea!");
		}
		if (amHealthy == true) {
			System.out.println("Go to a movie with friends!");
		}
		if (money > 0 && money < 10 && amHealthy == true) {
			System.out.println("Go for a coffee with friends!");
		}

	}

}
