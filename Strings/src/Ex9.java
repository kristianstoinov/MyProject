import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the contects of the string:");
		String string1 = sc.nextLine();
		String stringOfInts = new String();
		int sum = 0;
		for (int index = 0; index < string1.length()-1; index++) {

			if (string1.charAt(index) >= '0' && string1.charAt(index) <= '9') {
				if (index>0 && string1.charAt(index-1) == '-') {
					stringOfInts += '-';
				}
				stringOfInts += string1.charAt(index);
				if(index == string1.length() - 2 && string1.charAt(index + 1) >= '0' && string1.charAt(index + 1) <= '9'){
					stringOfInts+=string1.charAt(index+1);
				}
				
				if (string1.charAt(index + 1) < '0' || string1.charAt(index+1) > '9' || index==string1.length()-2) {
					System.out.println(stringOfInts);
					sum += Integer.parseInt(stringOfInts);
				}
			}else{
				stringOfInts=new String();
			}

		}
System.out.println("The sum is: " + sum);
	}

}
