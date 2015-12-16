import java.util.Scanner;

public class Ex14 {
	private static Scanner sc;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isWhite1=false;
		boolean isWhite2=false;
		System.out.println("\nPlease enter the first pair of coordinates (1 to 8) :");
		int pair1FirstCo = sc.nextInt();
		int pair1SecondCo = sc.nextInt();
		if((pair1FirstCo>=1 && pair1FirstCo<=8 )&&( pair1SecondCo>=1 && pair1SecondCo<=8 )){
			if((pair1FirstCo==pair1SecondCo )||( pair1FirstCo%2==1 && pair1SecondCo%2==1) || (pair1FirstCo%2==0 && pair1SecondCo%2==0)){
				System.out.println("\nThe square is black");
				isWhite1=false;
			}
			else{
				System.out.println("\nThe square is white");
				isWhite1=true;
			}
			
		}
		
		
System.out.println("\nNow please enter the second pair of coordinates (1 to 8):");
int pair2FirstCo=sc.nextInt();
int pair2SecondCo = sc.nextInt();
if((pair2FirstCo>=1 && pair2FirstCo<=8 )&&( pair2SecondCo>=1 && pair2SecondCo<=8 )){
	if((pair2FirstCo==pair2SecondCo )||( pair2FirstCo%2==1 && pair2SecondCo%2==1) || (pair2FirstCo%2==0 && pair2SecondCo%2==0)){
		System.out.println("\nThe square is black");
		isWhite2=false;
	}
	else{
		System.out.println("\nThe square is white");
		isWhite2=true;
	}
	
}

if(isWhite1==isWhite2){
	System.out.println("\nThe two squares are of the same colour!");
	
	
}
else{
	System.out.println("\nThe two squares are NOT of the same colour!");
}


	}

}
