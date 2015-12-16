import java.util.Scanner;

public class Exercise1 {

	private static Scanner sc;

	public static void main(String[] args) {

		double A = 0;
		double B = 0;
		double C = 0;
		sc = new Scanner(System.in);

		System.out.println("Please insert a value for A:");
		A = sc.nextDouble();
		System.out.println("Please insert a value for B:");
		B = sc.nextDouble();
		if(A < B) {
		System.out.println("Please insert a value for C:");
		C = sc.nextDouble();

		if ((C > A) && (C < B)) {
			System.out.println("The number " + C + " is between " + A + " and "
					+ B);
		} else {
			System.out.println("Wrong number!");
		}
		}else{
			System.out.println("Error!\nNumber A is greater than number B!");
			
			
		}

	}

}
