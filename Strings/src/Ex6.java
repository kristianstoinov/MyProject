import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the contects of the string:");
		String string1 = sc.nextLine();
		char[] charString = string1.toCharArray();
		boolean isNotEmpty = true;
		for (int index = 0; index < charString.length; index++) {
			if (Character.isLetter(charString[index])) {
				if (isNotEmpty == true) {
					charString[index] = Character.toUpperCase(charString[index]);
				} else {
					charString[index] = Character.toLowerCase(charString[index]);
				}
				isNotEmpty = false;
			} else {
				isNotEmpty = Character.isWhitespace(charString[index]);
			}
		}
		System.out.println("The new string is: ");
		System.out.println(charString);

	}

}
