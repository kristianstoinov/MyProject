import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the content of the first string: ");
		String string1 = sc.nextLine();
		System.out.println("Please enter the content of the second string: ");
		String string2 = sc.nextLine();
		String stringL;
		if (string1.length() > string2.length()) {
			stringL = string1;
		} else {
			stringL = string2;
		}
		if (string1.length() == string2.length()) {
			System.out.println("The strings are of equal length.");
		}
		for (int index = 0; index < stringL.length(); index++) {
			if (string1.charAt(index) != string2.charAt(index)) {
				System.out.print(index + 1 + " " + string1.charAt(index)
						+ " - " + string2.charAt(index) + "  \n");

			}

		}

	}

}
