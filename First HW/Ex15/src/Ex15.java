import java.util.Scanner;


public class Ex15 {
	
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter an hour of the day (1 to 24):");
	int hour = sc.nextInt();
	if(hour>=1 && hour<=24){
		if(hour>=18 || hour<4){
			System.out.println("Good evening,sir!");
		}
		if(hour>=4 && hour<9){
			System.out.println("Good morning,sir!");
		}
		if(hour>=9 && hour<18){
			System.out.println("Good day,sir!");
		}
	}
	else{
		System.out.println("Incorrect input data!");
	}
	
	
	
	
	
	
}
}
