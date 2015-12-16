import java.util.Scanner;

public class Ex14 {

	public static long factorial(int num) {
		long result;
		if (num == 0 || num == 1) {
			return 1;
		}

		result = factorial(num - 1) * num;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num = sc.nextInt();
		long returnValue = factorial(num);
		System.out.println(returnValue);
	}

}
