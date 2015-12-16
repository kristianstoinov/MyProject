import java.util.Scanner;

public class Ex19 {
	private static Scanner sc;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number (between 10 and 99) :");
		int num = sc.nextInt();
		if (num >= 10 && num <= 99) {
			while(num>1){
				if (num % 2 == 1) {
					num = (num * 3) + 1;
					System.out.print(" " + num);
					continue;
				
				} else {
					num *= 0.5;
					System.out.print(" " + num);
					continue;
				}

			}
		} else {
			System.out.println("Wrong input!");
		}

	}

}
