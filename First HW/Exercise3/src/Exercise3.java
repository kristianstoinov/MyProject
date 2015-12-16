import java.util.Scanner;


public class Exercise3 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int temp=0;
		
		System.out.println("Please insert a value for A:");
		int A = sc.nextInt();
		System.out.println("Please insert a value for B:");
		int B = sc.nextInt();
		temp = A;
		A=B;
		B=temp;
		System.out.println("The numbers are reversed "+ A + " and " +B);
		
		

	}

}
