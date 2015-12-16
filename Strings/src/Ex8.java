import java.util.Scanner;


public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the content of the string: ");
		String string1 = sc.nextLine();
		boolean isMirrored = true;
		for(int i=0;i<string1.length();i++){
			if(string1.charAt(i)!=string1.charAt(string1.length()-(1+i))){
				isMirrored=false;
			}
		}
		if(isMirrored){
			System.out.println("The string is a palindrome!");
		}else{
			System.out.println("The string is NOT a palindrome!");
		}

	}

}
