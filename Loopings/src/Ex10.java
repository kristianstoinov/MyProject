import java.util.Scanner;


public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int num=0;
		boolean flag = false;
		System.out.println("Please enter a number:");
		num = sc.nextInt();
		for (i = 1; i <= num; i++) {
			if (i != 1 && i != num && num % i == 0) {
				flag = true;

			}
		}
		if (flag == false) {
			System.out.println("The number is prime!");
		} else {
			System.out.println("The number is NOT prime!");
		}

	}

}
