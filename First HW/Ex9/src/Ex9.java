import java.util.Scanner;


public class Ex9 {
private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Please insert a value for A from 0 to 100:");
		int A = sc.nextInt();
		System.out.println("Please insert a value for B from 0 to 100:");
		int B = sc.nextInt();
		int product=0;
		int digit=0;
		if((A<100 && A>9) && (B<100 && B>9)){
			product=A*B;
			digit=(product%10);
			System.out.println("The product is :" + product);
			if(((product%10)%2==0)){
				
				System.out.println("The digit is even and it's " + digit);
			}
			else{
				System.out.println("The digit is odd and it's " + digit);
			}
			
			
			
		}
		else{ 
			System.out.println("Those are not two digit numbers!");
		}
	}

}
