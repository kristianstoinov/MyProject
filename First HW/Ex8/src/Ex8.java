import java.util.Scanner;

public class Ex8 {
	private static Scanner sc;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number between 1000 and 9999");
		int firstNum = sc.nextInt();
		int firstProduct= (firstNum%10) + (firstNum/1000)*10;
		int secondProduct=((firstNum/100)%10)*10 + ((firstNum/10)%10);
System.out.println(firstProduct);
System.out.println(secondProduct);
if(firstProduct>secondProduct){
	System.out.println("First number is bigger than the second");
}
if(firstProduct==secondProduct){
	System.out.println("The numbers are equal");
}
if(firstProduct<secondProduct){
	System.out.println("Second number is bigger than the first");
}
	}

}
