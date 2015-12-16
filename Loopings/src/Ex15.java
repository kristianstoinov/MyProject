import java.util.Scanner;


public class Ex15 {
private static Scanner sc;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter an end integer: ");
		int lastNum=sc.nextInt();
		int n=0;
		int sum=0;
		while(n<=lastNum){
			sum+=n;
			n++;
		}
		System.out.println("The sum is: " + sum);

	}

}
