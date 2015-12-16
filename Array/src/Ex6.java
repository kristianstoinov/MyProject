import java.util.Scanner;


public class Ex6 {

	public static void main(String[] args) {
		
		int[] arrayOne = { 10,6,11,7,9,1,10,15,16};
		int[] arrayTwo = { 10,6,11,7,9,1,20};
		boolean areNotEqual=false;
		boolean haveEqualLength=false;
		for (int index = 0; index < arrayTwo.length; index++) {
			if(arrayOne[index]!=arrayTwo[index]){
				areNotEqual=true;
				break;
			}else{
				areNotEqual=false;
			}
			if(arrayOne.length == arrayTwo.length){
				haveEqualLength=true;
				
			}else{
				
			}

		}
		if(areNotEqual==true){
			System.out.println("The arrays are NOT equal!");
		}else{
			System.out.println("The arrays have equal values!");
		}
		
		if(haveEqualLength==true){
			System.out.println("The arrays are of equal length!");
		}else{
			System.out.println("The arrays are NOT of equal length!");
		}
		
	}

}
