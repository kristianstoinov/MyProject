import java.util.Scanner;


public class NewEx3 {
 static boolean prime(int num,int divisor)
 {
	 
	 if(divisor==1){
		 return true;
	 }
	 if(num%divisor==0){
		 return false;
	 }
	 else{
		 
		 return prime(num,divisor-1);
	 }
 }
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert a number:");
		int num = sc.nextInt();
		int divisor=num-1;
		boolean isPrime = prime(num,divisor);
		if (isPrime==true) {
			System.out.println("The number is prime!");
		} else {
			System.out.println("The number is not prime!");
		}

	}

}
