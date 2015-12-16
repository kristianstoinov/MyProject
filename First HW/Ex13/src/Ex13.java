import java.util.Scanner;

public class Ex13 {


	private static Scanner sc;

	public static void main(String[] args) {
	 sc = new Scanner(System.in);
		System.out.println("Please insert temperature in Celsius (from -100 to 100): ");
		int temperature = sc.nextInt();
		
		
		if (temperature >= -100 && temperature <= 100) {
			if (temperature < -20) {
				System.out.println("It's freezing cold!");
			}
			if (temperature >= -20 && temperature < 0) {
				System.out.println("That's just cold.");
			}
			if (temperature >= 0 && temperature < 15)
				System.out.println("It's a bit chilly outside.");
			if (temperature >= 15 && temperature < 25) {
				System.out.println("It's warm outside.");
			}
			if (temperature >= 25) {
				System.out.println("It's hot outside!");
			}
		} else {
			System.out.println("Incorrect input!");
		}
	}

}