import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean same=false;
		System.out.println("Please enter the content of the first string: ");
		String string1 = sc.nextLine();
		System.out.println("Please enter the content of the second string: ");
		String string2 = sc.nextLine();
		System.out.println();
		for (int i = 0; i < string1.length(); i++) {
			for (int j = 0; j <= string2.length() - 1; j++) {
				if (string1.charAt(i) == string2.charAt(0)) {
					System.out.print(string2.charAt(j));
					same=true;
				}
					
			}

			if (string1.charAt(i) != string2.charAt(0)) {
				System.out.println(string1.charAt(i));
			} else {
				System.out.println();
			}
		}
		if(same!=true){
			System.out.println("There is no common letter between the two words.");
		}
	}

}
