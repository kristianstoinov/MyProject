import java.util.Scanner;


public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the contects of the string:");
		String string1 = sc.nextLine();
		String asciiString=new String();
		char asciiChar=' ';
		for(int index=0;index<string1.length();index++){
			asciiChar=string1.charAt(index);
			asciiChar+=5;
			asciiString+=asciiChar;
		}
		System.out.println(asciiString);

	}

}
