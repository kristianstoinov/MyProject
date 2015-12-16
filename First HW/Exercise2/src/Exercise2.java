import java.util.Scanner;


public class Exercise2 {
	
public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please insert a value for A:");
	int A = sc.nextInt();
	System.out.println("Please insert a value for B:");
	int B = sc.nextInt();
	int sum = A + B;
	int difference = A - B;
	int product = A*B;
	int partition = A/B;
	int excess = A%B;
	System.out.println("The sum of A and B is: " + sum);
	System.out.println("The difference between A and B is: " + difference);
	System.out.println("The product of A and B is: " + product);
	System.out.println("The partition of A and B is: " + partition);
	System.out.println("The excess partition of A and B is: " + excess);
	
	System.out.println("\nNow , please insert values for these!\n");
	
	System.out.println("Please insert a value for C:");
	double C = sc.nextDouble();
	System.out.println("Please insert a value for D:");
	double D = sc.nextDouble();
	double sumDouble = C + D;
	double differenceDouble = C - D;
	double productDouble = C*D;
	double partitionDouble = C/D;
	double excessDouble = C%D;
	System.out.println("The sum of C and D is: " + sumDouble);
	System.out.println("The difference between C and D is: " + differenceDouble);
	System.out.println("The product of C and D is: " + productDouble);
	System.out.println("The partition of C and D is: " + partitionDouble);
	System.out.println("The excess partition of C and D is: " + excessDouble);
}
}
