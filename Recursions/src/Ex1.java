import java.util.Scanner;


public class Ex1 {

	public static int fibonacci(int n){
		if(n==0){
			return 0;
		}
		else if(n==1){
			return 1;
		}
		else{
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please insert the position of the wanted fibonacci number:");
		int n=sc.nextInt();
int answer =fibonacci(n);		
System.out.println("The number is: ");
		System.out.println(answer);
	}

}
