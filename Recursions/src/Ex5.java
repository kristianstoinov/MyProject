import java.util.Scanner;


public class Ex5 {
	static int opposite=0;
	
	public static int reverseNum(int num){
		if(num<10){
			return opposite+=num;
		}
		opposite+=num%10;
		opposite*=10;
		return reverseNum(num/10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert a number:");
		int num = sc.nextInt();
		int reverse=reverseNum(num);
		System.out.println(reverse);
	}

}
