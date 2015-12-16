import java.util.Scanner;


public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the contects of the string:");
		String string1 = sc.nextLine();
		int counter=0;
		int longest=0;
		int wordsCount=1;
		for (int index = 0; index < string1.length(); index++) {
			if(string1.charAt(index)==' '){
				wordsCount++;
				counter=0;
			}else{
				counter++;
			}
			if(counter>longest){
				longest=counter;
			}
		}
		System.out.println("The number of words is : " + wordsCount + "\n and the longest is : " + longest);
	}
}
