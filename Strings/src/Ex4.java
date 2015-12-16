import java.util.Scanner;


public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the two names separated by a coma: ");
		String string1 = sc.nextLine();
		String firstName = null;
		String secondName = null;
		int space=0;
		int asciiFirst=0;
		int asciiSecond=0;
		for(int index=0;index<string1.length();index++){
			space++;
			if(string1.charAt(index)==','){
				space++;
				firstName =string1.substring(0, index-1);
				System.out.println("First name: " + firstName );
				secondName=string1.substring(space,string1.length());
			    System.out.println("Second name: " + secondName);
				}
			}
		for(int index=0;index<firstName.length();index++){
			asciiFirst+=(int) firstName.charAt(index);
		}
		
			
		for(int index=0;index<secondName.length();index++){
			asciiSecond+=(int) secondName.charAt(index);
		}
	
		
		if(asciiFirst>asciiSecond){
			System.out.println("Bigger ASCII: " + firstName);
		}else{
			System.out.println("Bigger ASCII: " + secondName);
		}

		
		
		
		}

	}


