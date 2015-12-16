import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the content of the first string: ");
		String string1 = sc.nextLine();
		System.out.println("Please enter the content of the second string: ");
		String string2 = sc.nextLine();
		if (string1.length() > 40 || string2.length() > 40) {
			System.out.println("Incorrect input!");
		}else{
			for (int index = 0; index < string1.length(); index++) {
				System.out.print(string1.toUpperCase().charAt(index));
			}
			System.out.print("\t");
			for (int index = 0; index < string1.length(); index++) {
				System.out.print(string1.toLowerCase().charAt(index));
			}
			System.out.print("\t");
			for (int index = 0; index < string2.length(); index++) {
				System.out.print(string2.toUpperCase().charAt(index));
			}
			System.out.print("\t");
			for (int index = 0; index < string2.length(); index++) {
				System.out.print(string2.toLowerCase().charAt(index));
			}

		}
	}

}
