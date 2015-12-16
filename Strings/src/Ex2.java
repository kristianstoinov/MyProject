import java.util.Scanner;


public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the content of the first string: ");
		String string1 = sc.nextLine();
		System.out.println("Please enter the content of the second string: ");
		String string2 = sc.nextLine();
	
		if(string1.length()>20 || string2.length()>20){
			System.out.println("Incorrect input!");
		}else{
			
			if(string1.length()>=string2.length()){
				string1= string2.substring(0, 5) + string1.substring(5,string1.length());
				System.out.println(string1.length() +  " " + string1);
			}else{
				string2 = string1.substring(0, 5) + string2.substring(5, string2.length());
				System.out.println(string2.length() + " " + string2);
			}
			
		
		}

	}

}
